package abstractFactoryPattern;

public class Female implements Gender {
	String name;
	int age;
	
	Female(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public String GenderType() {
		return "Female";
	}
	
	public String GetName() {
		return name;
	}	
}