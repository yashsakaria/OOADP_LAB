package strategyPattern;

public class Discount15 implements Discount {
	public float applyDiscount(float amount) {
		return amount*0.15f;
	}
}