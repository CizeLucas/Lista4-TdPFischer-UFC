package Questao18;

public class Questao18 {

	public static void main(String[] args) {
		
		int grid[][] = new int[3][3];
		
		int player = 1;
		
		grid[0][0] = 2;		grid[1][0] = 1;		 grid[2][0] = 2;
		
		grid[0][1] = 1;		grid[1][1] = 2;		 grid[2][1] = 1;
		
		grid[0][2] = 2;		grid[1][2] = 2;		 grid[2][2] = 1;
//		
//		///////////////////////////
//		
//		grid[0][0] = 1;		grid[1][0] = 2;		 grid[2][0] = 0;
		
//		grid[0][1] = 1;		grid[1][1] = 2;		 grid[2][1] = 0;
		
//		grid[0][2] = 1;		grid[1][2] = 0;		 grid[2][2] = 2;
//		
//		///////////////////////////
		
//		grid[0][0] = 1;		grid[1][0] = 1;		 grid[2][0] = 2;
		
//		grid[0][1] = 2;		grid[1][1] = 1;		 grid[2][1] = 0;
		
//		grid[0][2] = 2;		grid[1][2] = 2;		 grid[2][2] = 1;
		
		///////////////////////////
				
//		grid[0][0] = 2;		grid[1][0] = 2;		 grid[2][0] = 1;
		
//		grid[0][1] = 2;		grid[1][1] = 1;		 grid[2][1] = 0;
		
//		grid[0][2] = 1;		grid[1][2] = 2;		 grid[2][2] = 2;
		
		boolean lineWin = true;
		boolean columnWin = true;
		boolean diagonalWin1 = true;
		boolean diagonalWin2 = true;
		
		//checagem de linha (fixando i)
		for(int j=0; j<3 && (lineWin == false || j==0); j++) {
			lineWin = true;
			for(int i=0; i<3; i++) {
				if(grid[i][j]!=player) {
					//System.out.printf("i %d // j %d // %d    ", i, j, grid[i][j]);
					lineWin = false;
				}
			}
		}
		
		
		//checagem de coluna (fixando j)
		for(int i=0; i<3 && (columnWin == false || i==0); i++) {
			columnWin = true;
			for(int j=0; j<3; j++) {
				if(grid[i][j]!=player) { //
					columnWin = false;
				}
			}
		}
		
		
		//checagem de diagonal (incrementando i e j em 1)
		for(int s=0; s<3; s++) { //Diagonal "\"
			if(grid[0+s][0+s]!=player) { //
				diagonalWin1 = false;
			}
		}
		
		for(int s=0; s<3; s++) {//Diagonal "/"
			if(grid[0+s][2-s]!=player) { //
				diagonalWin2 = false;
			}
		}
		
		
		
		System.out.printf("O player %d ganhou em:\n Linha: ", player);
		System.out.print(lineWin);
		System.out.print("\n Coluna: "+ columnWin);
		System.out.print("\n Diagonal 1: "+ diagonalWin1);
		System.out.println("\n Diagonal 2: "+ diagonalWin2);
		
		System.out.println("\nPlayer "+player+" ganhou? "+(lineWin || columnWin || diagonalWin1 || diagonalWin2)+"\n\n");
	
		player = 2;
		//checagem de linha (fixando i)
		for(int j=0; j<3 && (lineWin == false || j==0); j++) {
			lineWin = true;
			for(int i=0; i<3; i++) {
				if(grid[i][j]!=player) {
					//System.out.printf("i %d // j %d // %d    ", i, j, grid[i][j]);
					lineWin = false;
				}
			}
		}
		
		
		//checagem de coluna (fixando j)
		for(int i=0; i<3 && (columnWin == false || i==0); i++) {
			columnWin = true;
			for(int j=0; j<3; j++) {
				if(grid[i][j]!=player) { //
					columnWin = false;
				}
			}
		}
		
		
		//checagem de diagonal (incrementando i e j em 1)
		for(int s=0; s<3; s++) { //Diagonal "\"
			if(grid[0+s][0+s]!=player) { //
				diagonalWin1 = false;
			}
		}
		System.out.printf("O player %d ganhou em:\n Linha: ", player);
		System.out.print(lineWin);
		System.out.print("\n Coluna: "+ columnWin);
		System.out.print("\n Diagonal 1: "+ diagonalWin1);
		System.out.println("\n Diagonal 2: "+ diagonalWin2);
		
		System.out.println("\nPlayer "+player+" ganhou? "+(lineWin || columnWin || diagonalWin1 || diagonalWin2));
	
	}

	
}
