package questao03;

public class Questao03 {

	public static void main(String[] args) {
		
		Fatura f = new Fatura(1, "Computador que programa automaticamente", 10, 1000000);
		
		System.out.printf("Valor total da fatura: %.2f Reais.\n\n", f.getValorFatura());
		
		System.out.printf("Preco antes: %.2f Reais\n\n", f.getPricePerUnit());
		f.applyDiscount(20);
		System.out.printf("Preco depois: %.2f Reais\n\n", f.getPricePerUnit());	
		
		f.getId();
		f.getDescription();
		f.getPricePerUnit();
		f.getQuantity();
		
		f.setId(2);
		f.setDescription("aaa");
		f.setPricePerUnit(999999);
		f.setQuantity(100);
		
		
	}

}
