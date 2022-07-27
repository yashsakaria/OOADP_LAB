package abstractFactoryPattern;

public class DifferentlyAbledPerson implements Person {
	Gender gender;
	
	DifferentlyAbledPerson(Gender gender) {
		this.gender = gender;
	}
	public String getPersonType() {
		return gender.GenderType() + " Differently Abled Person.";
	}
}