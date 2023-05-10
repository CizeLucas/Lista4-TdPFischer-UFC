package Questao18;

import java.util.Random;
import java.util.ArrayList;

public class Tabuleiro {
	
	public int tamanho;
	public int xMeio;
	public int yMeio;
	public ArrayList<Celulas> celulas;
	public Robo robo;
	
	public Tabuleiro(int tamanho) {
		this.tamanho = tamanho;
		celulas = new ArrayList<Celulas>();
		for(int x=0; x<tamanho; x++) {
			for(int y=0; y<tamanho; y++) {
				celulas.add(new Celulas(x, y));
			}
		}
		
		Random numAleatorio = new Random();
		for(int i=0; i<((int)tamanho*0.6); i++ ) {
			celulas.get(numAleatorio.nextInt(tamanho*tamanho)).ManipularMoeda(true);
		}
		
		xMeio = (int)tamanho/2;
		yMeio = (int)tamanho/2;
		for (Celulas celula : celulas) {
			if(celula.x==xMeio && celula.y==yMeio) {
				celula.ManipularMoeda(false);
				celula.ManipularRobo(true);
			}
		}
		
		
	}
	
	public void imprimirTabuleiro() {
		Celulas celulaTemp;
		for(int x=1; x<=tamanho*tamanho; x++) {
			celulaTemp = celulas.get(x-1);
			if(celulaTemp.temRobo()) {
				System.out.print("R ");
			} else if(celulaTemp.temMoeda()){
				System.out.print("$ ");
			} else {
				System.out.print("* ");
			}
			
			if(x%tamanho==0) 
				System.out.println();
			
		}
	}
}
