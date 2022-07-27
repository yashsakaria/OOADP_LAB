package facadePattern;

import java.util.*;

public class PointOfSales {
	
	private Scanner sc = new Scanner(System.in);
	private PaymentMode gc;
	private PaymentMode cash;
	private PaymentMode card;
	
	public PointOfSales() {
		gc = new GiftCertificate();
		cash = new Cash();
		card = new CreditDebitCard();
	}
	
	public void makeNewSale() {
		
		System.out.print("Enter the total number of items : ");
		int n = sc.nextInt();
		float amount = 0.0f;
		sc.nextLine();
		
		HashMap<String , Float> items = new HashMap<String, Float>();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter the name of the item : ");
			String itemName = sc.nextLine();
			System.out.print("Enter the price of the item : ");
			float itemPrice = sc.nextFloat();
			sc.nextLine();
			items.put(itemName, itemPrice);
			amount += itemPrice;
		}
		
		System.out.println("1.Gift Certificate \n2.Cash \n3.Credit-Debit Card");
		
		while(true) {
			
			System.out.print("Enter your preferred choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			
			if( ch == 1 ) {
				if(n==1) {
					System.out.print("Enter the gift certificate balance : ");
					float balance = sc.nextFloat();
					sc.nextLine();
					if(amount > balance) {
						gc.collectPayment(balance);
						cash.collectPayment(amount-balance);
						cash.cashback(amount-balance);
					} else {
						gc.collectPayment(amount);
						gc.cashback(amount);
					}
					break;
				} else {
					System.out.println("Gift certificate is only applicable on a single item.");
					System.out.println("Please try with a different payment mode.");
				}
			} else if (ch == 2) {
				cash.collectPayment(amount);
				cash.cashback(amount);
				break;
			} else if (ch == 3) {
				card.cashback(amount);
				card.cashback(amount);
				break;
			} else {
				System.out.println("Invalid Choice. Try again...");
			}
		}
	}
}