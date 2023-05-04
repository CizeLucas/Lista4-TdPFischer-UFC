package questao10;

public class Questao10 {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("Xze", "843.930.983-00", 19, 07, 1250, (22.5/100));
		
		System.out.println(e1.getName() +" Ganha "+ e1.calcularSalario() +"R$ por mes");

	}

}
