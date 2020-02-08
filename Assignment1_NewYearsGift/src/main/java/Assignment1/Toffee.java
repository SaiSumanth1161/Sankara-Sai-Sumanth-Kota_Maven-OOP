package Assignment1;

public class Toffee extends Candy{
	String candyType;
	int quantity;
	double totalWeight,weight=10;
	
	public Toffee(int quantity) {
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setTotalWeight(Gift g) {
		totalWeight=quantity*weight;
	}
	
	public double getTotalWeight() {
		return totalWeight;
	}
}
