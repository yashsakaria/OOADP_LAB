package singletonPattern;
import java.util.*;
public class History {
	
	private static History history;
	private ArrayList<String> URLHistory;
	
	private History() {
		URLHistory =  new ArrayList<String>();
	}
	
	public static History getInstance() {
		if(history == null)
			history = new History();
		return history;
	}
	
	public void addToHistory(String url) {
		URLHistory.add(url);
	}
	
	public void viewHistory() {
		for(String url : URLHistory)
			System.out.println(url);
	}
}