package decoratorPattern;

public abstract class Sport {
	
	enum gamesOnTable {
		TableTennis, Billiards, Snooker
	}
	
	enum boardGames {
		Carom, Chess
	}
	
	enum courtGames {
		Basketball, Badminton, Kabaddi
	}
	
	enum adventureGames {
		Trekking, ParaFliding, BungeeJumping
	}
	
	enum stadiumGames {
		Cricket, Football, Baseball
	}
	
	enum athletics {
		Running, HighJump
	}
	
	abstract public String getCurrentStock();
}