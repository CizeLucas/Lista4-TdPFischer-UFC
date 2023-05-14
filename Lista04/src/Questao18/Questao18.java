package Questao18;

public class Questao18 {

	public static void main(String[] args) {
		
		Tabuleiro t1 = new Tabuleiro(9);
		Robo robo = new Robo(t1.getxMeio(), t1.getyMeio(), t1, false);
		
		robo.roboComMovimentosRestritos(true);
		
		t1.imprimirTabuleiro();
		robo.movParaCima();
		t1.imprimirTabuleiro();
		robo.movParaCima();
		t1.imprimirTabuleiro();
		robo.movParaCima();
		t1.imprimirTabuleiro();
		
		robo.movDiagCimaDireita();
		t1.imprimirTabuleiro();
		robo.movDiagBaixoEsquerda();
		t1.imprimirTabuleiro();
		robo.movParaEsquerda();
		t1.imprimirTabuleiro();
		robo.movDiagCimaDireita();
		t1.imprimirTabuleiro();
		robo.movDiagCimaEsquerda();
		t1.imprimirTabuleiro();
		robo.movParaDireita();
		t1.imprimirTabuleiro();
		robo.movParaCima();
		t1.imprimirTabuleiro();
		
		System.out.println("\n\n");
		
		
		Tabuleiro t2 = new Tabuleiro(5);
		Robo robo2 = new Robo(t2.getxMeio(), t2.getyMeio(), t2, true);
		robo2.iniciarCaminhadaAutonomaB();
		
		//System.out.printf("(%d, %d)\n", robo.coord[0], robo.coord[1] );
		//t.imprimirTabuleiro();
		
		//System.out.println(robo.getPontuacao());
		

			
	
		
	}

	
}
