package questao06;

public class Questao06 {
	
	public static void main(String[] args) {
	
		Ingresso ingresso = new Ingresso("Show do Tuezin 085", 100);
		
		IngressoVip ingressovip = new IngressoVip("Show do Tuezin 085 - Camarote", 100, 50);
		
		System.out.println(ingresso.toString());
		System.out.println(ingressovip.toString());
		System.out.println("\n");
		
		Evento evento = new Evento(ingresso, 80, ingressovip, 20);
		
		evento.sellIngresso(100, true);
		System.out.println("\n");
		
		evento.sellIngresso(20, false);
		evento.sellIngresso(5, true);
		evento.computeValueOfSoldIngressos();
		System.out.println("\n");
		
		evento.seeRemainingIngressos();
	}
	
	
	
}
