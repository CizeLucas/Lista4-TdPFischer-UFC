package Questao16;

public class Elevador {

	private int quantityOfFloors;
	private int maxCapacityOfPeople;
	private int currentFloor;
	private int currentQttOfPeople;
	
	
	public Elevador(int quantityOfFloors, int maxCapacityOfPeople) {
		super();
		this.quantityOfFloors = quantityOfFloors;
		this.maxCapacityOfPeople = maxCapacityOfPeople;
		currentFloor=0;
		currentQttOfPeople=0;
	}
	
	public void entra() {
		if(currentQttOfPeople<maxCapacityOfPeople) {
			System.out.println("Uma pessoa entrou no elevador no andar " + currentFloor);
			currentQttOfPeople++;
		} else {
			System.out.println("O elevador esta cheio");
		}
	}
	
	public void sai() {
		if(currentQttOfPeople>=1) {
			System.out.println("Uma pessoa saiu do elevador no andar " + currentFloor);
			currentQttOfPeople--;
		} else {
			System.out.println("Nao existe ninguem no elevador para sair");
		}
	}
	
	public void sobe() {
		if(currentFloor<quantityOfFloors) {
			currentFloor++;
			System.out.println("O elevador subiu um andar, se encontrando no andar "+currentFloor);
		} else {
			System.out.println("O elevador ja se encontra no ultimo andar do predio");
		}
	}

	public void desce() {
		if(currentFloor>0) {
			currentFloor--;
			
			if(currentFloor!=0) 
				System.out.println("O elevador desceu um andar, se encotrando no andar "+currentFloor);
			else
				System.out.println("O elevador desceu um andar, se encotrando no terreo");
		} else {
			System.out.println("O elevador ja se encontra no terreo do predio");
		}
	}
	
	public void getCurrentFloor() {
		System.out.println("Agora o elevador se encontra no andar "+currentFloor);
	}
	
	public void getCurrentQttOfPeople() {
		System.out.println("Agora o elevador esta com "+currentQttOfPeople+" a bordo");
	}
	
	
	
	
}
