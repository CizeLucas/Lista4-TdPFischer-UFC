package questao03;

public class Fatura {

	int id;
	String description;
	int quantity;
	double pricePerUnit;
	double totalPrice;
	
	public Fatura(int id, String description, int quantity, double pricePerUnit) {
		
		this.id = id;
		this.description = description;
		
		if(quantity>=0)
			this.quantity = quantity;
		else
			this.quantity=0;
		
		if(pricePerUnit>=0)
			this.pricePerUnit = pricePerUnit;
		else
			this.pricePerUnit=0;
		
		this.totalPrice = pricePerUnit*quantity;
	}
	
	public void applyDiscount(int discountPercetage) {
		this.pricePerUnit = this.pricePerUnit*(1-((float)discountPercetage/100));
	}

	public double getValorFatura() {
		return pricePerUnit*quantity;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	
	
}
