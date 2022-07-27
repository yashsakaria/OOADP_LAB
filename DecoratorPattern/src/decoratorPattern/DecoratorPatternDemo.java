package decoratorPattern;
import decoratorPattern.Sport.*;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Sport indoorSport = new IndoorSport();
		Sport outdoorSport = new OutdoorSport();
		
		System.out.println(indoorSport.getCurrentStock());
		
		outdoorSport = new AdventureGames(outdoorSport, adventureGames.Trekking);
		outdoorSport = new Athletics(outdoorSport, athletics.HighJump);
		outdoorSport = new StadiumGames(outdoorSport, stadiumGames.Baseball);
		System.out.println(outdoorSport.getCurrentStock());		
	}
}