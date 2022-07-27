package bridgePattern;

public class Discount20 implements Discount{
	public float calculateDiscount(float amount) {
		return amount*0.20f;
	}
}