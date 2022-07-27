package templatePattern;
import java.util.*;

public class OfflineShopping extends Shopping {

	Scanner sc = new Scanner(System.in);
	@Override
	void selectItem() {
		System.out.print("\nEnter the name of the product : ");
		String name = sc.nextLine();
		System.out.print("Enter the price of the product : ");
		amount = sc.nextFloat(); sc.nextLine(); 
	}

	@Override
	void doPayment(float amount) {
		System.out.println("\n1. Credit/Debit card");
		System.out.println("2. Cash");
		System.out.print("Enter the mode of Payment : ");
		int ch = sc.nextInt(); sc.nextLine();
		
		if(ch==1)
			System.out.println("\nPlease swipe the card and make a payment of Rs." + amount);
		else
			System.out.println("\nPlease collect an amount of Rs." + amount);
	}

	@Override
	void doDelivery() {
		System.out.println("\nPlease pick up your product from the counter. Thankyou and visit again!");
	}
}