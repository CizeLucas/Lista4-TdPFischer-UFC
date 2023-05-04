package Questao12;

public class Vendedor extends Empregado{

	private double valorVendas;
	private double comissao;
	
	public Vendedor(String name, String identityNumber, int age, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(name, identityNumber, age, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	
	public double calcularSalario() {
		return (this.getSalarioBase() - (this.getSalarioBase()*imposto) + (valorVendas*comissao));
	}
	
	
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	
	
	
}
