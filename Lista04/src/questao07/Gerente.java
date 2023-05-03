package questao07;

public class Gerente extends Empregado{

	String deparment;
	
	public Gerente(String name, double wage, String deparment) {
		super(name, wage);
		this.deparment = deparment;
	}
	
	public String toString() {
		return String.format("O gerente '"+name+"' do departamento de '"+deparment+"', ganha "+wage+" Reais por mes.");
	}
}
