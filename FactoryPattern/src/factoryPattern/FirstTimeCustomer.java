package factoryPattern;

public class FirstTimeCustomer implements Customer{
	private String name;
	private int age;
	
	public FirstTimeCustomer(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getDetails() {
		System.out.println("Name : " + getName() + " Age : " + getAge() + " Class : First Time Customer");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}