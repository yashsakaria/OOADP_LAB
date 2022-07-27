package bridgePattern;

public class Discount25 implements Discount {
	public float calculateDiscount(float amount) {
		return amount*0.25f;
	}
}