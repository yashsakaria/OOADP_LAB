package abstractFactoryPattern;

public class PersonFactory {
	
	public Person getPerson(String person , Gender gender) {
		if(person.equals("Abled"))
			return new AbledPerson(gender);
		if(person.equals("Differently Abled"))
			return new DifferentlyAbledPerson(gender);
		return null;
	}
}