package singletonPattern;
import java.util.*;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		Browser browser;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. New Tab");
		System.out.println("2. New Window");
		System.out.print("Enter the choice : ");
		int ch = sc.nextInt(); sc.nextLine();
		
		if(ch == 1)
			browser = new BrowserTab();
		else 
			browser = new BrowserWindow();
		
		System.out.println("\n1. Surf the internet");
		System.out.println("2. View History");
		System.out.println("3. Exit");
		while(true) {
			System.out.print("\nEnter the operation : ");
			int op = sc.nextInt(); sc.nextLine();
			if(op==1) {
				System.out.print("Enter the url : ");
				String url = sc.nextLine();
				browser.surf(url);
			} else if (op==2)
				browser.viewHistory();
			else
				break;
		}
	}
}