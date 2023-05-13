package Questao18;

public class Questao18 {

	public static void main(String[] args) {
		
		Tabuleiro t = new Tabuleiro(9);
		Robo robo = new Robo(t.getxMeio(), t.getyMeio(), t);
		
		t.imprimirTabuleiro();
		System.out.println();
		
//		robo.movParaBaixo();
//		robo.movParaBaixo();
//		robo.movParaBaixo();
//		robo.movParaBaixo();
//		robo.movParaBaixo();
		
		robo.movDiagCimaDireita();
		robo.movDiagBaixoEsquerda();
		robo.movDiagBaixoEsquerda();
		robo.movDiagCimaDireita();
		
		robo.movDiagBaixoDireita();
		robo.movDiagCimaEsquerda();
		robo.movDiagCimaEsquerda();
		robo.movDiagBaixoDireita();
		
		robo.movParaEsquerda();
		robo.movParaEsquerda();
		robo.movParaEsquerda();
		
		//System.out.printf("(%d, %d)\n", robo.coord[0], robo.coord[1] );
		t.imprimirTabuleiro();
		
		System.out.println(robo.getPontuacao());
		

			
	
		
	}

	
}
