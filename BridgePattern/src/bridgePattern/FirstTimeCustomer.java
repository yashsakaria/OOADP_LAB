package bridgePattern;

public class FirstTimeCustomer extends Customer {
	FirstTimeCustomer(String name, String number, int age) {
		super(name, number, age);
	}
	
	void display() {
		System.out.println("Welcome " + name + ". As a first time customer, special Discounts are waiting for you.");
	}
}