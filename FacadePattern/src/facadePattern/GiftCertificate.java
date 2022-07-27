package facadePattern;

public class GiftCertificate implements PaymentMode {
	
	public void collectPayment(float amount) {
		System.out.println("Collect an amount of Rs." + amount + " through gift card");
	}
	
	public void cashback(float amount) {
		System.out.println("We currently do not offer cashback on payments through giftcard.");
	}
}