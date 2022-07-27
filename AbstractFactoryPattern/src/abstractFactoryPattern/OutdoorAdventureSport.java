package abstractFactoryPattern;

public class OutdoorAdventureSport implements Sport{
	
	Person person;
	
	public OutdoorAdventureSport(Person person) {
		this.person = person;
	}
	
	public void displayMenu() {
		System.out.println("1. Trekking");
		System.out.println("2. Para Gliding");
	}
	
	public SportItem getSport(int choice) {
		if(choice == 1)
			return new Trekking(person);
		if(choice == 2)
			return new ParaGliding(person);
		return null;
	}
	
	public String getSportType() {
		return "Outdoor Adventure Sport";
	}	
}