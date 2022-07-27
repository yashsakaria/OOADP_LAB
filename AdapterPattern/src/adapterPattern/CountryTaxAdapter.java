package adapterPattern;

import java.util.ArrayList;

public class CountryTaxAdapter implements StoreTax {
	CountryTax ct;
	
	public CountryTaxAdapter(CountryTax ct) {
		this.ct = ct;
	}
	
	public float calcTax(ArrayList<Item> items) {
		return ct.calcTax(items);
	}	
}