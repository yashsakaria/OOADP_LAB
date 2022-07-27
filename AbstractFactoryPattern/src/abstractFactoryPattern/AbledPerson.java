package abstractFactoryPattern;

public class AbledPerson implements Person {
	Gender gender;
	
	AbledPerson(Gender gender) {
		this.gender = gender;
	}
	public String getPersonType() {
		return gender.GenderType() + " Abled Person.";
	}	
}