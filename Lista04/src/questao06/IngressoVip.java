package questao06;

public class IngressoVip extends Ingresso {

	public double aditionalCost;
	
	public IngressoVip(String eventName, double cost, double aditionalCost) {
		super(eventName, cost);
		this.aditionalCost = aditionalCost;
	}

	public double getTotalCost() {
		return (this.cost+aditionalCost);
	}
	
	public String toString() {		
		return String.format("O custo do ingresso para '"+ eventName +"' eh: "+(cost+aditionalCost)+"\n");
	}
	
}
