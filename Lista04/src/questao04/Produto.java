package questao04;

public class Produto {

	String name;
	int quantity;
	double price;
	
	public Produto(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String comprarProduto(int QttPurchased) {
		
		quantity = quantity-QttPurchased;
		
		if(QttPurchased>=100) {
			if(QttPurchased>=200) {
				if(QttPurchased>=500) {
					return String.format("Comprado "+ QttPurchased +" unidades de '"+ name +"', totalizando "+ (QttPurchased*price*0.75));
				}
				return String.format("Comprado "+ QttPurchased +" unidades de '"+ name +"', totalizando "+ (QttPurchased*price*0.8));
			}
			return String.format("Comprado "+ QttPurchased +" unidades de '"+ name +"', totalizando "+ (QttPurchased*price*0.9));
		}
		return String.format("Comprado "+ QttPurchased +" unidades de '"+ name +"', totalizando "+ (QttPurchased*price));	
	}
}
