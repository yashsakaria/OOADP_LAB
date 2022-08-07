package factoryPattern;
import java.util.*;

public class CustomerFactory {
	
	private ArrayList<Customer> customers;
	
	public CustomerFactory() {
		customers = new ArrayList<Customer>();
	}
	
	Customer getCustomer(String name, int age) {
		
		for (Customer c : customers)
			if(c.getName().equalsIgnoreCase(name) && c.getAge() == age)
				return c;
		
		Customer customer = null;
		
		if(age > 60) {
			customer = new SeniorCitizenCustomer(name, age);
			customers.add(customer);
			return customer;
		} else {
			customer = new RegularCustomer(name, age);
			customers.add(customer);
			return new FirstTimeCustomer(name, age);
		}
	}
}