package questao04;

public class Questao04 {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Livro Java Completo & Total", 3000, 40);
		
		System.out.println(produto.comprarProduto(1000));

	}
}
