package Assignment1;

public class CoffeBite extends Candy{
	String candyType;
	int quantity;
	double Weight=80;
	double totalWeight;
	public CoffeBite(int quantity) {
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setTotalWeight(Gift g) {
		totalWeight=quantity*Weight;
	}
	
	public double getTotalWeight() {
		return totalWeight;
	}
}
