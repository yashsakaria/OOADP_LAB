package strategyPattern;

import java.util.*;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StoreLevelDiscount storeDiscount;
		Customer customer = null;
		
		System.out.print("Enter the Minimum cart value to avail Store Level Discount : ");
		float baseAmount = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the discount to be applied : ");
		float discountAmount = sc.nextFloat();
		sc.nextLine();
		
		storeDiscount = new StoreLevelDiscount(baseAmount, discountAmount);
		
		System.out.println("1. Regular Customer");
		System.out.println("2. Senior Citizen Customer");
		System.out.println("3. First Time Customer");
		System.out.println("4. Exit");
		
		while(true) {
			System.out.print("\nEnter the type of customer : ");
			int ch = sc.nextInt();
			sc.nextLine();
			
			if(ch==4)
				break;
			
			System.out.print("Customer name : ");
			String name = sc.nextLine();
			System.out.print("Customer number : ");
			String number = sc.nextLine();
			
			System.out.print("Enter the total bill amount : ");
			float amount = sc.nextFloat();
			sc.nextLine();
			
			float st_discount = storeDiscount.applyDiscount(amount);
			if(st_discount != 0)
				System.out.println("Congrats! You have availed Store Level Discount of Rs." + st_discount);
			
			if (ch==1)
				customer = new RegularCustomer(name, number, new Discount12());
			else if (ch==2)
				customer = new SeniorCitizenCustomer(name, number, new Discount10());
			else if (ch==3)
				customer = new FirstTimeCustomer(name, number, new Discount15());
			
			float cus_discount = customer.getDiscount(amount-st_discount);
			System.out.println("Congrats! You have availed Customer Discount of Rs." + cus_discount);
			System.out.println("Total amount to be paid Rs." + (amount-st_discount-cus_discount));
			
		}
		sc.close();
	}
}