package Questao15;

public class Produto {
	
	private String name;
	private double cost;
	private double sellPrice;
	private double profitMargin;
	private double expenses;

	public Produto(String name, double cost, double sellPrice, double expenses) {
		this.name = name;
		this.cost = cost;
		this.sellPrice = sellPrice;
		this.expenses = expenses;
	}
	
	public double calcProfitMargin() {
		profitMargin = ((sellPrice - (cost + expenses)) / sellPrice)*100;
		return 	profitMargin;
	}

	public String getName() {
		return name;
	}

	
}
