package Assignment1;
import java.util.*;
import java.io.*;

public class NewYearGift {
	static double totalWeight=0;static int candiesCount=0;
	
	static Gift setType(String name, Scanner sc) {
		Gift g=new Gift();
		g.setDetails();
		int quantity;

		System.out.print("Enter Quantity : ");
		quantity=sc.nextInt();
		
		if(name.equals("coffebite")) {
			CoffeBite c=new CoffeBite(quantity);
			c.setDetails("coffebite", 80);
			g=c.getDetails();
			g.quantity=c.getQuantity();
			c.setTotalWeight(g);
			g.totalWeight=c.getTotalWeight();
			
			if(g.totalWeight<300)
				candiesCount+=1;
		}
		
		else if(name.equals("toffee")){
			Toffee t= new Toffee(quantity);
			t.setDetails("Toffee", 10);
			g=t.getDetails();
			g.quantity=t.getQuantity();
			t.setTotalWeight(g);
			g.totalWeight=t.getTotalWeight();
			if(g.totalWeight<300)
				candiesCount+=1;
		}
		
		else if(name.equals("Kaju")) {
			Kaju k=new Kaju(quantity);
			k.setDetails("Kaju", 25);
			g=k.getDetails();
			g.quantity=k.getQuantity();
			k.setTotalWeight(g);
			g.totalWeight=k.getTotalWeight();
		}
		
		else if(name.equals("Jamun")) {
			Jamun j=new Jamun(quantity);
			j.setDetails("Jamun", 15);
			g=j.getDetails();
			g.quantity=j.getQuantity();
			j.setTotalWeight(g);
			g.totalWeight=j.getTotalWeight();
		}
		
		else if(name.equals("Nerds")) {
			Nerds n=new Nerds(quantity);
			n.setDetails("Kaju", 25);
			g=n.getDetails();
			g.quantity=n.getQuantity();
			n.setTotalWeight(g);
			g.totalWeight=n.getTotalWeight();
			if(g.totalWeight<300)
				candiesCount+=1;
		}
		
		else
		{
			System.out.println("The gift is neither a sweet or candy");
		}
		
		totalWeight+=g.totalWeight;
		return g;
	}
	
	public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	try {
    		System.out.println("The Sweets and Candies present are : ");
    		System.out.println("1) coffebite");
    		System.out.println("2) toffee");
    		System.out.println("3) Nerds");
    		System.out.println("4) Kaju");
    		System.out.println("5) Jamun");
    		System.out.print("Enter number of gifts : ");
    		int n=sc.nextInt();
    		int i,k=0;
    		Gift []candies=new Gift[n];
    		Gift []sweets=new Gift[n];
    		
    		int k1=0,k2=0;
    		for(i=0;i<n;i++)
    		{
    			System.out.print("Enter the name of the gift as shown in the above: ");
    			String name=sc.next();
    			Gift y=NewYearGift.setType(name,sc);
    			if(y.giftType=="Candy")
    				candies[k1++]=y;
    			else if(y.giftType=="Sweets")
    				sweets[k2++]=y;
    		}
    		
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("The total weight (the number of candies or Sweets) is :"+ totalWeight);
    		System.out.println();
    		
    		Arrays.sort(candies,new Gift());
    		
    		System.out.println("The Sweets present in the given gifts are "+k2);
    		for(i=0;i<k2;i++) {
    			System.out.println((i+1)+") "+sweets[i].giftType+" "+sweets[i].name+" "+sweets[i].cost+" "+sweets[i].quantity+" "+sweets[i].totalWeight);
    		}
    		System.out.println();
    		System.out.println();
    		System.out.println("After sorting the "+k1+" candies on the total weight");
    		if(k1>0)
    		System.out.println("S.no Type  Name  Cost  Quantity  Totalweight");
    		
    		for(i=0;i<k1;i++) {
    			System.out.println((i+1)+") "+candies[i].giftType+" "+candies[i].name+" "+candies[i].cost+" "+candies[i].quantity+" "+candies[i].totalWeight);
    		}	
    		
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("The number of candies present in the given predetermined range of 0-300 are : "+ candiesCount);
    		
    	}
    	catch(Exception e) {
			System.out.println(e);
		}
    }
}
