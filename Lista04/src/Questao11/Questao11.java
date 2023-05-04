package Questao11;

public class Questao11 {

	public static void main(String[] args) {
		
		Operario o1 = new Operario("Xze", "843.930.983-00", 19, 07, 1250, (22.5/100), 2000, 0.05);
		
		System.out.println(o1.getName() +" Ganha "+ o1.calcularSalario() +" R$ por mes");

	}

}
