package decoratorPattern;

public class Athletics extends Sport {
	Sport sport;
	athletics ath;
	
	public Athletics(Sport sport , athletics ath) {
		this.sport = sport;
		this.ath = ath;
	}
	
	public String getCurrentStock() {
		int stock = getStock();
		String currentStock = "Athletics, " + ath.toString() + " : " + stock + " units\n";
		return sport.getCurrentStock() + currentStock;
	}
	
	private int getStock() {
		if(ath == athletics.Running)
			return 22;
		if(ath == athletics.HighJump)
			return 18;
		return 0;
	}
}