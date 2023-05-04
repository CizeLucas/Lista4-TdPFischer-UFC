package Questao12;

public class Questao12 {

	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor("Xze", "843.930.983-00", 19, 07, 1250, (22.5/100), 5000, 0.01);
		
		System.out.println("O vendedor '"+ v1.getName() +"' Ganha "+ v1.calcularSalario() +" R$ por mes");

	}

}
