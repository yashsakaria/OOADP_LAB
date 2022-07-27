package singletonPattern;

public abstract class Browser {
	History history;
	public abstract void surf(String url);
	public void viewHistory() {
		history.viewHistory();
	}
}