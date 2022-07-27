package decoratorPattern;

public class GamesOnTable extends SportDecorator{
	
	Sport sport;
	gamesOnTable got;
	
	public GamesOnTable(Sport sport , gamesOnTable got) {
		this.sport = sport;
		this.got = got;
	}
	
	public String getCurrentStock() {
		int stock = getStock();
		String currentStock = "Games On Table , " + got.toString() + " : " + stock + " units\n";
		return sport.getCurrentStock() + currentStock;
	}
	
	private int getStock() {
		if(got == gamesOnTable.TableTennis)
			return 50;
		if(got == gamesOnTable.Billiards)
			return 30;
		if(got == gamesOnTable.Snooker)
			return 20;
		return 0;
	}
}