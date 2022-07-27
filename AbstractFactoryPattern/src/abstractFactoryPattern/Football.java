package abstractFactoryPattern;

public class Football implements SportItem {
	Person p;
	Football(Person p) {
		this.p = p;
	}
	@Override
	public String getSportItemDetails() {
		return "This is a Football Product for a " + p.getPersonType();
	}
}