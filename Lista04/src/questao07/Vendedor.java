package questao07;

public class Vendedor extends Empregado {

	double comissionPercentage;
	
	public Vendedor(String name, double wage, double comissionPercentage) {
		super(name, wage);
		this.comissionPercentage = comissionPercentage;
	}

	public double calculateWage() {
		return wage+wage*(comissionPercentage/100);
	}
	
	public String toString() {
		return String.format("O empregado '"+name+"' ganha "+wage+" R$ p/ mes. Mas devido a comissao de "+comissionPercentage+ " por cento,\nesse valor aumenta para "+(wage+wage*(comissionPercentage/100))+" R$ p/ mes.");
	}
	
	
}
