package questao07;

public class Empregado {

	public String name;
	protected double wage;
	
	public Empregado(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}
	
	public String toString() {
		return String.format("O empregado '"+name+"' ganha "+wage+" Reais por mes.");
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	
}
