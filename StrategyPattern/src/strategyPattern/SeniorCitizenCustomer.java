package strategyPattern;

public class SeniorCitizenCustomer extends Customer {
	
	SeniorCitizenCustomer(String name, String number, Discount discount) {
		super(name, number);
		this.discount = discount;
	}
	@Override
	float getDiscount(float amount) {
		return discount.applyDiscount(amount);
	}
}