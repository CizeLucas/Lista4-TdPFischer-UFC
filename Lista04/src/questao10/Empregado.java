package questao10;

public class Empregado extends Pessoa{

	public int codigoSetor;
	private double salarioBase;
	public double imposto;
	
	public Empregado(String name, String identityNumber, int age, int codigoSetor, double salarioBase, double imposto) {
		super(name, identityNumber, age);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public double calcularSalario() {
		return (salarioBase - (salarioBase*imposto));
	}
	
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
	
	
}
