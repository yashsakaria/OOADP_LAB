package observerPattern;
import java.util.*;

public class DiscountSubject implements Subject{
	private ArrayList<Observer> customers;
	String itemName;
	int discount;
	
	public DiscountSubject() {
		customers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer o) {
		customers.add(o);
	}
	
	public void removeObserver(Observer o) {
		customers.remove(o);
	}
	
	public void notifyObservers() {
		for(Observer customer : customers)
			customer.update();
		System.out.println("All subscribers notified.");
	}
	
	public ArrayList<Observer> getObservers() {
		return customers;
	}
	
	public void setDiscount(String itemName, int discount) {
		this.itemName = itemName;
		this.discount = discount;
		notifyObservers();
	}
	
	public String getDiscount() {
		return "Item Name : " + itemName + ". Discount on item : " + discount;
	}
}