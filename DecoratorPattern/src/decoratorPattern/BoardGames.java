package decoratorPattern;

public class BoardGames extends SportDecorator {
	Sport sport;
	boardGames bg;
	
	public BoardGames(Sport sport, boardGames bg) {
		this.sport = sport;
		this.bg = bg;
	}
	
	public String getCurrentStock() {
		int stock = getStock();
		String currentStock = "Board Games, " + bg.toString() + " : " + stock + " units\n";
		return sport.getCurrentStock() + currentStock;
	}
	
	private int getStock() {
		if(bg == boardGames.Carom)
			return 75;
		if(bg == boardGames.Chess)
			return 75;
		return 0;
	}
}