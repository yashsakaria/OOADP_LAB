package abstractFactoryPattern;

public class GenderFactory {
	public Gender getGender(String gender, String name, int age) {
		if(gender.equals("Male"))
			return new Male(name,age);
		if(gender.equals("Female"))
			return new Female(name, age);
		return null;
	}
}