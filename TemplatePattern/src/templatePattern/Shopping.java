package templatePattern;

public abstract class Shopping {
	
	float amount;
	
	public final void processOrder() {
		selectItem();
		doPayment(amount);
		doDelivery();
	}
	
	abstract void selectItem();
	abstract void doPayment(float amount);
	abstract void doDelivery();
}