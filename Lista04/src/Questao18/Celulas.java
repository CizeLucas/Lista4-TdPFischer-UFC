package Questao18;

public class Celulas {
	
	int id;
	int x;
	int y;
	private boolean temMoeda;
	private boolean temRobo;
	private boolean roboVisitou;
	
	Celulas(int id, int x, int y){
		this.id = id;
		this.x = x;
		this.y = y;
		temMoeda = false;
		temRobo = false;
		roboVisitou = false;
	}
	
	
	public boolean getRoboVisitou() {
		return roboVisitou;
	}
	
	public void setRoboVisitou(boolean roboVisitou) {
		this.roboVisitou = roboVisitou;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean getTemRobo() {
		return temRobo;
	}
	
	public boolean getTemMoeda() {
		return temMoeda;
	}
	
	public void setTemRobo(boolean temRobo) {
		this.temRobo = temRobo;
	}
	
	public void setTemMoeda(boolean temMoeda) {
		this.temMoeda = temMoeda;
	}
	
	
}
