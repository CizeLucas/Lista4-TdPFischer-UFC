package questao06;

public class Ingresso {

	public String eventName;
	public double cost;
	
	public Ingresso(String eventName, double cost) {
		this.eventName = eventName;
		this.cost = cost;
	}
	
	public String toString() {		
		return String.format("O custo do ingresso para '"+ eventName +"' eh: "+cost+"\n");
	}
	
}
