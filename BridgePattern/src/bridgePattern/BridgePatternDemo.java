package bridgePattern;

import java.util.*;

public class BridgePatternDemo {
	
	static ArrayList<Customer> customers;
	
	enum SportItem {
		TennisRacket , CricketBat, TreadMills, BoxingGloves, Other 
	}
	
	public static void main(String[] args) {
		customers = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		Customer currentCustomer = null;
		
		while(true) {
			
			float totalAmount = 0f;
			float totalDiscount = 0f;
			
			System.out.print("Enter the name of the customer : ");
			String name = sc.nextLine();
			System.out.print("Enter the number of the customer : ");
			String number = sc.nextLine();
			System.out.print("Enter the age of the customer : ");
			int age = sc.nextInt();
			
			for(Customer c : customers)
				if(c.number.equals(number)) {
					currentCustomer = c;
					break;
				}
			
			if (currentCustomer == null) {
				if (age >= 60) {
					currentCustomer = new SeniorCitizenCustomer(name, number, age);
					customers.add(currentCustomer);
				} else {
					customers.add(new RegularCustomer(name, number, age));
					currentCustomer = new FirstTimeCustomer(name, number, age);
				}
			}
			
			System.out.println();
			currentCustomer.display();
			System.out.println();
			System.out.println("1. Tennis Racket");
			System.out.println("2. Cricket Bat");
			System.out.println("3. Tread-Mill");
			System.out.println("4. Boxing Gloves");
			System.out.println("5. Other Sport Item");
			System.out.println("6. Checkout");
			
			while(true) {
				System.out.print("\nEnter your choice : ");
				int ch = sc.nextInt();
				
				if(ch==6) {
					System.out.println("Total value of the products : Rs." + totalAmount);
					System.out.println("Total Discount Applied : Rs." + totalDiscount);
					System.out.println("Total amount to be paid : Rs." + (totalAmount-totalDiscount));
					break;
				} else {
					System.out.print("Enter the price of the item : ");
					float price = sc.nextFloat();
					sc.nextLine();
					currentCustomer.setDiscountType(getDiscountType(SportItem.values()[ch-1]));
					float discount = currentCustomer.calculateDiscount(price);
					if(discount != 0f)
						System.out.println("Discount applied on " + SportItem.values()[ch-1].toString() + " is Rs." + discount );
					totalDiscount += discount;
					totalAmount += price;
				}
			}
			
			System.out.print("\nTo continue press 1 : ");
			int ch = sc.nextInt(); sc.nextLine();
			if(ch!=1)
				break;
		}
		
		sc.close();
	}
	
	public static Discount getDiscountType(SportItem st ) {
		if (st == SportItem.TennisRacket)
			return new Discount20();
		if(st == SportItem.CricketBat)
			return new Discount15();
		if(st == SportItem.TreadMills)
			return new Discount30();
		if(st == SportItem.BoxingGloves)
			return new Discount25();
		return null;
	}
}