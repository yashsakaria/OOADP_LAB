package factoryPattern;
import java.util.*;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		CustomerFactory cf = new CustomerFactory();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("\nEnter the name of the customer : ");
			String name = sc.nextLine();
			System.out.print("Enter the age of the customer : ");
			int age = sc.nextInt(); sc.nextLine();
			System.out.println();
			Customer customer = cf.getCustomer(name, age);
			customer.getDetails();
			
			System.out.print("\nTo continue press 1 : ");
			int ch = sc.nextInt(); sc.nextLine();
			
			if(ch != 1)
				break;
		}
		
		sc.close();
	}
}