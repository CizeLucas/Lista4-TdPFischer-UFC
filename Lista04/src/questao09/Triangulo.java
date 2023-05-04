package questao09;

public class Triangulo extends Formas {
	
	public void imprimirNome() {
		System.out.println("Tringulo");	
	}

	public double calcularArea(double base, double altura) {	
		return base*altura/2;
	}

}
