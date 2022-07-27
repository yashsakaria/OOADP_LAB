package strategyPattern;

public abstract class Customer {
	Discount discount;
	String name , number;
	
	Customer(String name , String number) {
		this.name = name;
		this.number = number;
	}
	
	public void setDiscountType(Discount d) {
		discount = d;
	}
	
	abstract float getDiscount(float amount);
	
}