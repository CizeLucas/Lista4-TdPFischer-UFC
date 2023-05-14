package Questao18;

import java.util.Random;
import java.util.ArrayList;

public class Tabuleiro {
	
	public int tamanho;
	public int xMeio;
	public int yMeio;
	public ArrayList<Celulas> celulas;
	
	public Tabuleiro(int tamanho) {
		this.tamanho = tamanho;
		int cont=0;
		celulas = new ArrayList<Celulas>();
		for(int y=0; y<tamanho; y++) {
			for(int x=0; x<tamanho; x++) {
				celulas.add(new Celulas(cont, x, y));
				cont++;
			}
		}
		
		Random numAleatorio = new Random();
		for(int i=0; i<((int)tamanho*0.7); i++ ) { // B)
			celulas.get(numAleatorio.nextInt(tamanho*tamanho)).setTemMoeda(true);
		}
		
		xMeio = (int)tamanho/2;
		yMeio = (int)tamanho/2;
	}
	
	public void inicializarRobo(int coord[]) {
		for (Celulas celula : celulas)
			if(celula.getX() == coord[0] && celula.getY() == coord[1]) {
				celula.setTemRobo(true);
				celula.setTemMoeda(false);
				celula.setRoboVisitou(true);
			}
	}
	
	public boolean moverRobo(int coordInicial[], int coordFinal[] ) {
		boolean celulaFinalTemMoeda=false;
		
		for (Celulas celula : celulas) {
			if(celula.getX() == coordInicial[0] && celula.getY() == coordInicial[1]) {
				celula.setTemRobo(false);
			}
			if(celula.getX() == coordFinal[0] && celula.getY() == coordFinal[1]) {
				celula.setTemRobo(true);
				celulaFinalTemMoeda = (celula.getTemMoeda() && !celula.getRoboVisitou());
				celula.setRoboVisitou(true);
			}
		}
		return celulaFinalTemMoeda;
	}
	
	
	
	public boolean coordenadaExiste(int coord[]) {
		return (coord[0]+1<=tamanho && coord[0]>=0 && coord[1]+1<=tamanho && coord[1]>=0);
	}
	
	public int getxMeio() {
		return xMeio;
	}

	public int getyMeio() {
		return yMeio;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void imprimirTabuleiro() { // E)
		Celulas celulaTemp;
		int contY=tamanho-1;
		for(int i=0; i<tamanho; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int x=1; x<=tamanho*tamanho; x++) {
			celulaTemp = celulas.get(x-1);
			
			if(celulaTemp.getTemRobo()) {
				System.out.print("# "); //se tiver robo
			} else if(celulaTemp.getRoboVisitou()) {
				
				if(celulaTemp.getTemMoeda()){
					System.out.print("$ "); //se tiver moeda
				} else {
					System.out.print("@ "); //se nao tiver NADA
				}
				
			} else {
				System.out.print("* "); //se nao tiver NADA
			}
			if(x%tamanho==0) {
				System.out.println(contY+" ");
				contY--;
			}
		}
		System.out.println();
	}
	
}
