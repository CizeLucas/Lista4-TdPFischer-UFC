package questao07;

public class Questao07 {
	public static void main(String[] args) {
		
		Empregado empregado = new Empregado("Joao", 1536);
		
		Gerente gerente = new Gerente("Junior", 2048, "Financas");
		
		Vendedor vendedor = new Vendedor("Lucas", 1024, 20);
		
		System.out.println(empregado.toString());
		
		System.out.println(gerente.toString());
		
		System.out.println(vendedor.toString());
		
		System.out.println("\n");
		vendedor.setWage(2048*2);
		System.out.println(vendedor.calculateWage());
	}
}
