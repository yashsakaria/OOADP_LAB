package bridgePattern;

public abstract class Customer {
	private Discount discount;
	String name , number;
	int age;
	
	Customer(String name , String number , int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	void setDiscountType(Discount d) {
		discount = d;
	}
	
	float calculateDiscount(float amount) {
		return (discount == null) ? 0f : discount.calculateDiscount(amount);
	}
	
	abstract void display();
}