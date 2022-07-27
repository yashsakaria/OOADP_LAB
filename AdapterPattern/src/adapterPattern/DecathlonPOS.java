package adapterPattern;

import java.util.*;

public class DecathlonPOS {
	
	ArrayList<Item> items;
	StoreTax countryTaxAdapter;
	
	public DecathlonPOS() {
		items = new ArrayList<Item>();
		countryTaxAdapter = new CountryTaxAdapter(new MauriTax());
	}
	
	public void setItems() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("\nEnter the name of the item : ");
			String itemName = sc.nextLine();
			System.out.print("Enter the price of the item : ");
			float itemPrice = sc.nextFloat();
			sc.nextLine();
			System.out.print("Enter the quantity of the item : ");
			int itemQty = sc.nextInt();
			sc.nextLine();
			items.add(new Item(itemName , itemPrice , itemQty));
			System.out.print("\nTo continue press 1 : ");
			int ch = sc.nextInt();
			sc.nextLine();
			if (ch != 1)
				break;	
		}
		System.out.print("\nThe tax to be collected is : Rs." + countryTaxAdapter.calcTax(items));
		
		sc.close();
	}
}