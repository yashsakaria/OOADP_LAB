package abstractFactoryPattern;

public class IndoorRegularSport implements Sport{
	
	Person person;
	
	public IndoorRegularSport(Person person) {
		this.person = person;
	}
	
	public void displayMenu() {
		System.out.println("1. Table Tennis");
		System.out.println("2. Squash");
	}
	
	public SportItem getSport(int choice) {
		if(choice == 1)
			return new TableTennis(person);
		if(choice == 2)
			return new Squash(person);
		return null;
	}
	
	public String getSportType() {
		return "Indoor Regular Sport";
	}	
}