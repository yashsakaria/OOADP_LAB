package abstractFactoryPattern;

public class Trekking implements SportItem {
	Person p;
	Trekking(Person p) {
		this.p = p;
	}
	@Override
	public String getSportItemDetails() {
		return "This is a Trekking Sport Product for a " + p.getPersonType();
	}
}