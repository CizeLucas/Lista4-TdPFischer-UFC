package Questao17;

public class Questao17 {

	public static void main(String[] args) {
		
		JogoDaVelha jv = new JogoDaVelha();

		System.out.println("JOGO DA VELHA:\n\n> Cada jogador deve inserir a coordenada de sua jogada da Seguinte forma: \n"
				+ "    ij -> (i, j)    Exemplo: 23 -> (2, 3)");		
		System.out.println("\n        ( i , j )\n   (1,1)  (1,2)  (1,3)\n   (2,1)  (2,2)  (2,3)\n   (3,1)  (3,2)  (3,3)\n\n");

		int gameResult = jv.startGame();
		if(gameResult!=0) {
			if(gameResult==1) 
				System.out.println("Parabens Jogador 1, Vc GanhouUu!");
			 else 
				System.out.println("Parabens Jogador 2, Vc GanhouUu!");
		} else {
			System.out.println("O jogo empatou! Parabens aos jogadores!");
		}
		
		/* 		( i , j )
		 * 
		 * (1,1) 	(1,2)	(1,3)
		 * 
		 * (2,1)	(2,2)	(2,3)
		 * 
		 * (3,1)	(3,2)	(3,3)
		 * 
		 * */
		
	//21 23 12 22 33 32 31 11 13 -> empate
	//11 22 13 12 23 32 -> jogador 2 ganha
	//11 22 13 12 23 31 33 -> jogador 1 ganha
		
	}

}
