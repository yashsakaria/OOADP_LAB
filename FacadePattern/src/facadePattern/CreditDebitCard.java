package facadePattern;

public class CreditDebitCard implements PaymentMode {
	
	public void collectPayment(float amount) {
		System.out.println("Swipe the card for an amount of Rs." + amount + ".");
	}
	
	public void cashback(float amount) {
		int cashback = (int) (amount*0.1f);
		System.out.println("You have been offered a cashback of Rs." + cashback);
	}
}