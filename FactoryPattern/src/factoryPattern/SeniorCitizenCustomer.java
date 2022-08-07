package factoryPattern;

public class SeniorCitizenCustomer implements Customer {
	private String name;
	private int age;
	
	public SeniorCitizenCustomer(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getDetails() {
		System.out.println("Name : " + getName() + " Age : " + getAge() + " Class : Senior Citizen Customer");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}