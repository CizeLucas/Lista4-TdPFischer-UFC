package Questao15;

public class Questao15 {

	public static void main(String[] args) {
		Produto p = new Produto("Computador", 8500, 10000, 1000);

		System.out.println("O produto '"+p.getName()+"' tem "+p.calcProfitMargin()+"% de margem de lucro");
	}

}
