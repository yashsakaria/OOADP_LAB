package abstractFactoryPattern;

public class Squash implements SportItem {
	Person p;
	Squash(Person p) {
		this.p = p;
	}
	@Override
	public String getSportItemDetails() {
		return "This is a Squash Sport Product for a " + p.getPersonType();
	}
}