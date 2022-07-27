package templatePattern;

import java.util.*;

public class OnlineShopping extends Shopping {
	
	private static ArrayList<Product> products;
	Scanner sc = new Scanner(System.in);
	
	public OnlineShopping() {
		if(products == null)
			generateProducts();
	}
	
	private void generateProducts() {
		products = new ArrayList<Product>();
		products.add(new Product("Rain Jackets" , 599));
		products.add(new Product("Swimming Suit" , 999));
		products.add(new Product("Hiking Shoes" , 1599));
	}
	
	public void selectItem() {
		System.out.println("\nProduct ID \t Product Name \t Product Price");
		for(int i = 0 ; i < products.size() ; i++)
			System.out.println((i+1) + " \t\t " + products.get(i).name + " \t " + products.get(i).price);
		System.out.print("\nEnter the Product ID of the product you wish to buy : ");
		int ch = sc.nextInt(); sc.nextLine();
		amount += products.get(ch-1).price;
	}
	
	public void doPayment(float amount) {
		System.out.println("\n1. Credit/Debit card");
		System.out.println("2. UPI");
		System.out.print("Enter the mode of Payment : ");
		int ch = sc.nextInt(); sc.nextLine();
		
		if(ch==1)
			System.out.println("\nPlease enter the card details and make a payment of Rs." + amount);
		else
			System.out.println("\nPlease make a payment of Rs." + amount + " at decathlon@ybl");
	}
	
	public void doDelivery() {
		System.out.print("\nEnter your shipping address : ");
		String address = sc.nextLine();
		System.out.println("\nDelivery Charges of Rs.50 will be collected on the delivery of Product.");
		System.out.println("Your product is on the way and is expected to arrive within 3 days.");
	}
}