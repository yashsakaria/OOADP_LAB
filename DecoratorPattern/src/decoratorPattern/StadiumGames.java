package decoratorPattern;

public class StadiumGames extends Sport{
	Sport sport;
	stadiumGames sg;
	
	public StadiumGames(Sport sport , stadiumGames sg) {
		this.sport = sport;
		this.sg = sg;
	}
	
	public String getCurrentStock() {
		int stock = getStock();
		String currentStock = "Stadium Games, " + sg.toString() + " : " + stock + " units\n";
		return sport.getCurrentStock() + currentStock;
	}
	
	private int getStock() {
		if(sg == stadiumGames.Cricket)
			return 123;
		if(sg == stadiumGames.Football)
			return 55;
		if(sg == stadiumGames.Baseball)
			return 22;
		return 0;
	}	
}