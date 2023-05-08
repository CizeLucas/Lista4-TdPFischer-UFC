package Questao16;

public class Questao16 {

	public static void main(String[] args) {
		Elevador e = new Elevador(5, 7);

		e.desce();
		
		e.sai();
		
		e.entra();
		e.entra();
		
		e.sobe();
		e.sai();
		
		e.sobe();
		e.sai();
		
		e.desce();
		e.desce();
		
		System.out.println();
		e.sobe();
		e.sobe();
		e.sobe();
		e.sobe();
		e.sobe();
		e.sobe();
	}

}
