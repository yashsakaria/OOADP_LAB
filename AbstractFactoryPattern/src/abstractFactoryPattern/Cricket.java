package abstractFactoryPattern;

public class Cricket implements SportItem {
	Person p;
	Cricket(Person p) {
		this.p = p;
	}
	@Override
	public String getSportItemDetails() {
		return "This is a Cricket Kit Product for a " + p.getPersonType();
	}
}