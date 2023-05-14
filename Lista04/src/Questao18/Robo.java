package Questao18;

public class Robo {
	
	public Tabuleiro plano;
	public int coord[] = new int[2];
	public int pontuacao;
	private int qtdCasasVisitadas;
	private int qtdCasasNorte; // Cima
	private int qtdCasasSul; //Baixo
	private int qtdCasasLeste; //Direita
	private int qtdCasasOeste; //Esquerda
	private int qtdCasasNordeste; //Cima Direita
	private int qtdCasasSudeste; //Baixo Direita
	private int qtdCasasNoroeste; //Cima Esquerda
	private int qtdCasasSudoeste; //Baixo Esquerda
	private boolean movimentosRestritos;
	private int idDoMovimento;
	
	public Robo(int xMeio, int yMeio, Tabuleiro plano, boolean iniciaEmCoordZeroZero) {
		this.plano = plano;
		if(iniciaEmCoordZeroZero) {
			coord[0] = 0;
			coord[1] = 0;
			
		} else {
			coord[0] = xMeio;
			coord[1] = yMeio;
		}
		plano.inicializarRobo(coord);
		pontuacao=0;
		qtdCasasVisitadas=0;
		qtdCasasNorte=0;
		qtdCasasSul=0;
		qtdCasasLeste=0;
		qtdCasasOeste=0;
		qtdCasasNordeste=0;
		qtdCasasSudeste=0;
		qtdCasasNoroeste=0;
		qtdCasasSudoeste=0;
		movimentosRestritos = false;
		idDoMovimento=0;
	}
	
	//vai realizar os movimentos aqui
	
	public void roboComMovimentosRestritos(boolean movRestritos) { // D)
		movimentosRestritos = movRestritos;
	}
	
	public boolean movParaCima(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==1)) {
			idDoMovimento = 1;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[1]--; //y-- para subir
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasNorte++;
			} else {
				coord[1]++;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public boolean movParaBaixo(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==2)) {
			idDoMovimento = 2;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[1]++; //y++ para descer
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasSul++;
			} else {
				coord[1]--;
				movRealizado = false;
			}
		} 
		return movRealizado;
	}
	
	public boolean movParaDireita(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==3)) {
			idDoMovimento = 3;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[0]++; //x++ para direita
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasLeste++;
			} else {
				coord[0]--;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public boolean movParaEsquerda(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==4)) {
			idDoMovimento = 4;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[0]--; //x-- para esquerda
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasOeste++;
			} else {
				coord[0]++;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public boolean movDiagCimaDireita(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==5)) {
			idDoMovimento = 5;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[0]++; //x++ para direita
			coord[1]--; //y-- para subir
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasNordeste++;
			} else {
				coord[0]--;
				coord[1]++;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public boolean movDiagCimaEsquerda(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==6)) {
			idDoMovimento = 6;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[0]--; //x-- para esquerda
			coord[1]--; //y-- para subir
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasNoroeste++;
			} else {
				coord[0]++;
				coord[1]++;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public boolean movDiagBaixoDireita(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==7)) {
			idDoMovimento = 7;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[0]++; //x++ para direita
			coord[1]++; //y++ para descer
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasSudeste++;
			} else {
				coord[0]--;
				coord[1]--;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public boolean movDiagBaixoEsquerda(){
		boolean movRealizado=false;
		if(!(movimentosRestritos && idDoMovimento==8)) {
			idDoMovimento = 8;
			movRealizado=true;
			int coordTemp[] = new int[2];
			coordTemp[0] = coord[0];
			coordTemp[1] = coord[1];
			coord[0]--; //x-- para esquerda
			coord[1]++; //y++ para descer
			if(plano.coordenadaExiste(coord)) {
				if(plano.moverRobo(coordTemp, coord)) {
					this.modificarPontuacao(10, true);
				}
				qtdCasasVisitadas++;
				qtdCasasSudoeste++;
			} else {
				coord[0]++;
				coord[1]--;
				movRealizado=false;
			}
		}
		return movRealizado;
	}
	
	public void iniciarCaminhadaAutonomaB() {
		this.roboComMovimentosRestritos(false);
		
		for(;this.movDiagBaixoDireita();) 
			plano.imprimirTabuleiro();
		
	
		for(;this.movParaCima();) 
			plano.imprimirTabuleiro();
		
		
		for(;this.movDiagBaixoEsquerda();)
			plano.imprimirTabuleiro();
		
		for(;this.movParaCima();) 
			plano.imprimirTabuleiro();
		
	}
	
	public void iniciarCaminhadaAutonomaA() {
		this.roboComMovimentosRestritos(false);
		
		do {

			for(;this.movParaDireita();) 
				plano.imprimirTabuleiro();
			
			this.movParaBaixo();
			
			for(;this.movParaEsquerda();) 
				plano.imprimirTabuleiro();
			
		} while(this.movParaBaixo());
		
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public void modificarPontuacao(int qtdPontos, boolean ganhou) {
		if(ganhou) {
			pontuacao+=qtdPontos;
		} else {
			pontuacao-=qtdPontos;
		}
	}
	
	public int getQtdCasasVisitadas() { // G)
		return qtdCasasVisitadas;
	}
	
	public int qtdDeCasasAVisitar() { // H)
		return (plano.getTamanho()*plano.getTamanho()-qtdCasasVisitadas);
	}
	
	// A) 
	public int getQtdCasasNorte() {
		return qtdCasasNorte;
	}

	public int getQtdCasasSul() {
		return qtdCasasSul;
	}

	public int getQtdCasasLeste() {
		return qtdCasasLeste;
	}

	public int getQtdCasasOeste() {
		return qtdCasasOeste;
	}

	public int getQtdCasasNordeste() {
		return qtdCasasNordeste;
	}

	public int getQtdCasasSudeste() {
		return qtdCasasSudeste;
	}

	public int getQtdCasasNoroeste() {
		return qtdCasasNoroeste;
	}

	public int getQtdCasasSudoeste() {
		return qtdCasasSudoeste;
	}
	
	
	
}
