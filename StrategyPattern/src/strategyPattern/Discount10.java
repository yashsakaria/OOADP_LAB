package strategyPattern;

public class Discount10 implements Discount {
	public float applyDiscount(float amount) {
		return amount*0.10f;
	}
}