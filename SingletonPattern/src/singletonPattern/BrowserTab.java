package singletonPattern;

public class BrowserTab extends Browser {
	
	public BrowserTab() {
		history = History.getInstance();
	}
	
	public void surf(String url) {
		history.addToHistory(url);
		System.out.println("Showing search result for : " + url);
	}
}