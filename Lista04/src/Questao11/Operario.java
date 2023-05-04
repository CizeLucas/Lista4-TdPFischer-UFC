package Questao11;

public class Operario extends Empregado{

	private double valorProducao;
	private double comissao;
	
	public Operario(String name, String identityNumber, int age, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(name, identityNumber, age, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return (this.getSalarioBase() - (this.getSalarioBase()*imposto) + (valorProducao*comissao));
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}