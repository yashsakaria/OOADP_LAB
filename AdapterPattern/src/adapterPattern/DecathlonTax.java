package adapterPattern;

import java.util.ArrayList;

public class DecathlonTax implements StoreTax {
	public float calcTax(ArrayList<Item> items) {
		float tax = 0.0f;
		for(Item i : items)
			tax += (i.itemPrice * i.itemQty * 0.05f);
		return tax;
	}
}