package singletonPattern;

public class BrowserWindow extends Browser {
	
	public BrowserWindow() {
		history = History.getInstance();
	}
	
	public void surf(String url) {
		history.addToHistory(url);
		System.out.println("Showing search result for : " + url);
	}	
}