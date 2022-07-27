package abstractFactoryPattern;

public class OutdoorRegularSport implements Sport{
	
	Person person;
	
	public OutdoorRegularSport(Person person) {
		this.person = person;
	}
	
	public void displayMenu() {
		System.out.println("1. Cricket");
		System.out.println("2. Football");
	}
	
	public SportItem getSport(int choice) {
		if(choice == 1)
			return new Cricket(person);
		if(choice == 2)
			return new Football(person);
		return null;
	}
	
	public String getSportType() {
		return "Outdoor Regular Sport";
	}
	
}
