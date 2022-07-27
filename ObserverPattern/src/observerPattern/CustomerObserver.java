package observerPattern;

public class CustomerObserver implements Observer {
	private Subject subject;
	private String name, number;
	
	public CustomerObserver(String name, String number, Subject subject) {
		this.name = name;
		this.number = number;
		this.subject = subject;
		subject.addObserver(this);
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void update() {
		System.out.println("Name : " + name + ". I've got an update on " + subject.getDiscount());
	}
}