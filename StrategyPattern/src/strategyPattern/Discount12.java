package strategyPattern;

public class Discount12 implements Discount {
	public float applyDiscount(float amount) {
		return amount*0.12f;
	}
}