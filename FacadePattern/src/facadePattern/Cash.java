package facadePattern;

public class Cash implements PaymentMode{
	
	public void collectPayment(float amount) {
		System.out.println("Collect an amount of Rs." + amount + " via cash.");
	}
	
	public void cashback(float amount) {
		int cashback = (int) (amount*0.1f);
		System.out.println("You have been offered a cashback of Rs." + cashback);
	}
}