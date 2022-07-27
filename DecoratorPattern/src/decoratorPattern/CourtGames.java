package decoratorPattern;

public class CourtGames extends SportDecorator {
	Sport sport;
	courtGames cg;
	
	public CourtGames(Sport sport, courtGames cg) {
		this.sport = sport;
		this.cg = cg;
	}
	
	public String getCurrentStock() {
		int stock = getStock();
		String currentStock = "Court Games, " + cg.toString() + " : " + stock + " units\n";
		return sport.getCurrentStock() + currentStock;
	}
	
	private int getStock() {
		if(cg == courtGames.Basketball)
			return 12;
		if(cg == courtGames.Badminton)
			return 33;
		if(cg == courtGames.Kabaddi)
			return 30;
		return 0;
	}
}