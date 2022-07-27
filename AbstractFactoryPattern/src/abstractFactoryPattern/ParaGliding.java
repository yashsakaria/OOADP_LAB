package abstractFactoryPattern;

public class ParaGliding implements SportItem {
	Person p;
	ParaGliding(Person p) {
		this.p = p;
	}
	@Override
	public String getSportItemDetails() {
		return "This is a Para Gliding Sport Product for a " + p.getPersonType();
	}
}