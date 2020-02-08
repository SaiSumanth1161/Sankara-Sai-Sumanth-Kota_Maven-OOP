package Assignment1;

public class Sweets {
	String giftType;
	int cost,quantity;
	Gift g=new Gift();
	
	public void setDetails() {
		giftType=null;
		cost=0;
		quantity=0;
	}
	
	
	public void setDetails(String name, double cost) {
		g.giftType="Sweets";
		g.name=name;
		g.cost=cost;
		g.quantity=1;
		g.totalWeight=cost;
	}
	
	public Gift getDetails() {
		
		return g;
	}
	
}
