package Assignment1;

public class Nerds extends Candy{
	String candyType;
	int quantity;
	double totalWeight,weight=5;
	
	public Nerds(int quantity) {
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
