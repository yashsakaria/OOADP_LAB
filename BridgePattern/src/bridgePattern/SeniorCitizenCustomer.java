package bridgePattern;

public class SeniorCitizenCustomer extends Customer {
	SeniorCitizenCustomer(String name, String number, int age) {
		super(name, number, age);
	}
	
	void display() {
		System.out.println("Welcome " + name + ". To our Senior Citizen's, we express our gratitude.");
	}
}