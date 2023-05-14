package Questao18;

public class Questao18 {

	public static void main(String[] args) {
		
		Tabuleiro t = new Tabuleiro(5);
		//Robo robo = new Robo(t.getxMeio(), t.getyMeio(), t, false);
		Robo robo2 = new Robo(t.getxMeio(), t.getyMeio(), t, true);

		robo2.iniciarCaminhadaAutonomaB();
		
		//System.out.printf("(%d, %d)\n", robo.coord[0], robo.coord[1] );
		//t.imprimirTabuleiro();
		
		//System.out.println(robo.getPontuacao());
		

			
	
		
	}

	
}
