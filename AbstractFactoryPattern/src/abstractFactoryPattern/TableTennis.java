package abstractFactoryPattern;

public class TableTennis implements SportItem {
	Person p;
	TableTennis(Person p) {
		this.p = p;
	}
	@Override
	public String getSportItemDetails() {
		return "This is a Table Tennis Bench for a " + p.getPersonType();
	}
}