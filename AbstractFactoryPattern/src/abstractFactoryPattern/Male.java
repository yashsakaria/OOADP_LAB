package abstractFactoryPattern;

public class Male implements Gender {
	String name;
	int age;
	
	Male(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public String GenderType() {
		return "Male";
	}
	
	public String GetName() {
		return name;
	}	
}