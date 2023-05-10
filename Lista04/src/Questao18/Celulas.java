package Questao18;

public class Celulas {
	
	int x;
	int y;
	Robo robo;
	private boolean temMoeda;
	private boolean temRobo;
	
	Celulas(int x, int y){
		this.x = x;
		this.y = y;
		temMoeda = false;
		temRobo = false;
	}
	
	public boolean temRobo() {
		return temRobo;
	}
	
	public boolean temMoeda() {
		return temMoeda;
	}
	
	public void ManipularRobo(boolean temRobo) {
		this.temRobo = temRobo;
	}
	
	public void ManipularMoeda(boolean temMoeda) {
		this.temMoeda = temMoeda;
	}
	
	
}
