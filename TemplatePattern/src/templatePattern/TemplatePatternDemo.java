package templatePattern;
import java.util.*;

public class TemplatePatternDemo {
	public static void main(String[] args) {
		Shopping shopping;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Offline Shopping");
		System.out.println("2. Online Shopping");
		System.out.print("Enter your choice : ");
		int ch = sc.nextInt(); sc.nextLine();
		
		if(ch==1)
			shopping = new OfflineShopping();
		else
			shopping = new OnlineShopping();
		
		shopping.processOrder();
		sc.close();
	}
}