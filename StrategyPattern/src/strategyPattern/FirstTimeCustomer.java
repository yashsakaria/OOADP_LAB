package strategyPattern;

public class FirstTimeCustomer extends Customer {
	
	FirstTimeCustomer(String name, String number, Discount discount) {
		super(name, number);
		this.discount = discount;
	}
	@Override
	float getDiscount(float amount) {
		return discount.applyDiscount(amount);
	}
}