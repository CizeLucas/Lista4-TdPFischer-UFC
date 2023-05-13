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
	
	public Robo(int xMeio, int yMeio, Tabuleiro plano) {
		this.plano = plano;
		coord[0] = xMeio;
		coord[1] = yMeio;
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
	}
	
	//vai realizar os movimentos aqui
	
	public void movParaCima(){
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
		}
	}
	
	public void movParaBaixo(){
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
		}
	}
	
	public void movParaDireita(){
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
		}
	}
	
	public void movParaEsquerda(){
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
		}
	}
	
	public void movDiagCimaDireita(){
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
		}
	}
	
	public void movDiagCimaEsquerda(){
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
		}
	}
	
	public void movDiagBaixoDireita(){
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
		}
	}
	
	public void movDiagBaixoEsquerda(){
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
		}
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
