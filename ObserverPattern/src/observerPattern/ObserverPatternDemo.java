package observerPattern;
import java.util.*;

public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiscountSubject discountSubject = new DiscountSubject();
		
		System.out.println("1. Subscribe new Customer");
		System.out.println("2. Unsubscribe Existing Customer");
		System.out.println("3. Update Discounts");
		System.out.println("4. Exit");
		
		while(true) {
			System.out.print("\nEnter your choice : ");
			int ch = sc.nextInt(); sc.nextLine();
			
			if(ch==1) {
				System.out.print("Enter the name of the customer : ");
				String name = sc.nextLine();
				System.out.print("Enter the number of the customer : ");
				String number = sc.nextLine();
				new CustomerObserver(name, number, discountSubject);
			} 
			else if(ch==2) {
				System.out.print("Enter the name of the customer : ");
				String name = sc.nextLine();
				System.out.print("Enter the number of the customer : ");
				String number = sc.nextLine();
				ArrayList<Observer> customers = discountSubject.getObservers();
				for(Observer customer : customers) {
					if(customer.getName().equals(name) && customer.getNumber().equals(number)) {
						discountSubject.removeObserver(customer);
						break;
					}
				}
			} 
			else if(ch==3) {
				System.out.print("Enter the name of the item : ");
				String itemName = sc.nextLine();
				System.out.print("Enter the discount on the item : ");
				int discount = sc.nextInt();
				discountSubject.setDiscount(itemName, discount);
			} else 
				break;
		}
		sc.close();	
	}
}