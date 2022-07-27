package abstractFactoryPattern;
import java.util.*;

public class AbstractFactoryPatternDemo {
	static GenderFactory genderFactory;
	static PersonFactory personFactory;
	static SportFactory sportFactory;
	static String[] sports = {"OutdoorAdventureSport" , "OutdoorRegularSport" , "IndoorRegularSport"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		genderFactory = new GenderFactory();
		personFactory = new PersonFactory();
		sportFactory = new SportFactory();
		
		System.out.print("Enter the name of the person : ");
		String name = sc.nextLine();
		System.out.print("Enter the age of the person : ");
		int age = sc.nextInt(); sc.nextLine();
		System.out.print("Enter the gender (Male / Female) : ");
		String genderType = sc.nextLine();
		
		Gender gender = genderFactory.getGender(genderType, name, age);
		
		System.out.print("Is the Person Differently Abled or Abled : ");
		String personType = sc.nextLine();
		Person person = personFactory.getPerson(personType, gender);
		
		System.out.println();
		System.out.println("1. Outdoor Adventure Sport");
		System.out.println("2. Outdoor Regular Sport");
		System.out.println("3. Indoor Regular Sport");
		System.out.print("Enter the type of sport product needed : ");
		String sportType = sports[sc.nextInt()-1]; sc.nextLine();
		Sport sport = sportFactory.getSport(sportType, person);
		
		System.out.println();
		sport.displayMenu();
		System.out.print("Enter your choice : ");
		int gameType = sc.nextInt(); sc.nextLine();
		
		SportItem sportItem = sport.getSport(gameType);
		System.out.println("\n" + sportItem.getSportItemDetails());
		sc.close();
	}
}