package abstractFactoryPattern;

public class SportFactory {
	public Sport getSport(String sport , Person person) {
		if(sport.equals("OutdoorAdventureSport"))
			return new OutdoorAdventureSport(person);
		if(sport.equals("OutdoorRegularSport"))
			return new OutdoorRegularSport(person);
		if(sport.equals("IndoorRegularSport"))
			return new IndoorRegularSport(person);
		return null;
	}
}