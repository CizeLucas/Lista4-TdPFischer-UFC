package Questao17;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		JogoDaVelha jv = new JogoDaVelha();
		Scanner scan = new Scanner(System.in);
		String strTemp;
		int i;
		int j;
		
		System.out.println("JOGO DA VELHA:\n\n> Cada jogador deve inserir a coordenada de sua jogada da Seguinte forma: \n"
				+ "    ij -> (i, j)    Exemplo: 23 -> (2, 3)");
		
		System.out.println("\n        ( i , j )\n   (1,1)  (1,2)  (1,3)\n   (2,1)  (2,2)  (2,3)\n   (3,1)  (3,2)  (3,3)\n\n");
		
		do {
			for(int p=1; p<3 && !jv.isFinalGame(); p++) {
				do {
					System.out.printf("Jogador %d, sua vez: ", p);
					strTemp = scan.nextLine();
					i = Character.getNumericValue(strTemp.charAt(0))-1;
					j = Character.getNumericValue(strTemp.charAt(1))-1;
					if(!jv.isPlayerMoveValid(i, j))
						System.out.println("Coordenadas nao validas (1 a 3) ou ja ocupadas por outro jogador!");
				} while(!jv.isPlayerMoveValid(i, j));
					
				jv.updateGridWithPlayerMove(p, i, j);
				jv.printGrid();
			} //loop for
		} while(!jv.isFinalGame());
		
		if(jv.isFinalGame(1)) {
			System.out.println("Parabens Jogador 1, Vc GanhouUu!");
		} else{
			if(jv.isFinalGame(2)){
				System.out.println("Parabens Jogador 2, Vc GanhouUu!");
			}
			
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
	
	scan.close();
	}

}
