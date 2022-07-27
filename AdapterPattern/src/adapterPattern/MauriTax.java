package adapterPattern;

import java.util.*;

public class MauriTax implements CountryTax {
	public float calcTax(ArrayList<Item> items) {
		float tax = 0.0f;
		for(Item i : items)
			tax += (i.itemPrice * i.itemQty * 0.18f);
		return tax;
	}	
}