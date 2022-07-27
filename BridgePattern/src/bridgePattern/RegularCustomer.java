package bridgePattern;

public class RegularCustomer extends Customer {
	public RegularCustomer(String name, String number, int age) {
		super(name, number, age);
	}
	
	void display() {
		System.out.println("Welcome back " + name + ". We are happy to see you.");
	}
}