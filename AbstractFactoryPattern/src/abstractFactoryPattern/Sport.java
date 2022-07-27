package abstractFactoryPattern;

public interface Sport {
	void displayMenu();
	SportItem getSport(int choice);
	String getSportType();
}