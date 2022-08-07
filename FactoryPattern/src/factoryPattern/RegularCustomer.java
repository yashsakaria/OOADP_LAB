package factoryPattern;

public class RegularCustomer implements Customer {
	private String name;
	private int age;
	
	public RegularCustomer(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getDetails() {
		System.out.println("Name : " + getName() + " Age : " + getAge() + " Class : Regular Customer");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}