package facadePattern;

public interface PaymentMode {
	public void collectPayment(float amount);
	public void cashback(float amount);	
}