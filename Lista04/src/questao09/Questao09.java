package questao09;

public class Questao09 {
	public static void main(String[] args) {
	
		Triangulo t = new Triangulo();
		Retangulo r = new Retangulo();
		Quadrado q = new Quadrado();
		
		
		t.imprimirNome();
		System.out.println(t.calcularArea(10, 10));
		System.out.println();
		
		r.imprimirNome();
		System.out.println(r.calcularArea(7, 7));
		System.out.println();
		
		q.imprimirNome();
		System.out.println(q.calcularArea(5, 5));
		System.out.println();
	}
}
