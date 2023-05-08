package Questao14;

public class Questao14 {

	public static void main(String[] args) {
		
		Pessoa AB = new Pessoa("Albert Einstein", 14, 3, 1879);
		Pessoa IN = new Pessoa("Isaac Newton", 4, 1, 1643);
		
		System.out.println(AB.informaNome()+": ");
		System.out.println(AB.informaIdade());
		
		System.out.println();
		
		System.out.println(IN.informaNome()+": ");
		System.out.println(IN.informaIdade());
		
		System.out.println();
		
		System.out.println(IN.informaNome()+": (com ano de nascimento atualizado para 1543)");
		IN.ajustaDataDeNascimento(4, 1, 1543);
		IN.calculaIdade();
		System.out.println(IN.informaIdade());
	}

}
