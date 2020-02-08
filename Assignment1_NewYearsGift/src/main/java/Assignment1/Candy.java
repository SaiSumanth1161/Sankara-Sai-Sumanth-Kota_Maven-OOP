package Assignment1;

public class Candy implements Gifts{
	String giftType;
	int cost,quantity;
	Gift g=new Gift();

	public void setDetails() {
		g.giftType=null;
		g.cost=0;
		g.quantity=0;
	}
	
	public void setDetails(String name, double cost) {
		g.giftType="Candy";
		g.name=name;
		g.cost=cost;
		g.quantity=1;
		g.totalWeight=cost;
	}
	
	public Gift getDetails() {
		return g;
	}
	
}
