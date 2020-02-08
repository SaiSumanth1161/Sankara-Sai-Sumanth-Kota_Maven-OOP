package Assignment1;

import java.util.Comparator;

public class Gift implements Comparator<Gift>{
	String giftType;
	String name;
	double cost,totalWeight;
	int quantity;
	
	void setDetails() {
		giftType=null;
		cost=0;
		totalWeight=0;
		name=null;
		quantity=0;
	}
    public int compare(Gift g1,Gift g2) {
        return (int)(g1.totalWeight - g2.totalWeight);
    }
}
