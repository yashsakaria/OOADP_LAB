package decoratorPattern;

public class AdventureGames extends Sport {
	Sport sport;
	adventureGames ag;
	public AdventureGames(Sport sport , adventureGames ag) {
		this.sport = sport;
		this.ag = ag;
	}
	
	public String getCurrentStock() {
		int stock = getStock();
		String currentStock = "Adventure Games, " + ag.toString() + " : " + stock + " units\n";
		return sport.getCurrentStock() + currentStock;
	}
	
	private int getStock() {
		if(ag == adventureGames.Trekking)
			return 75;
		if(ag == adventureGames.ParaFliding)
			return 65;
		if(ag == adventureGames.BungeeJumping)
			return 60;
		return 0;
	}
}
