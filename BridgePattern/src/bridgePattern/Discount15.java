package bridgePattern;

public class Discount15 implements Discount{
	public float calculateDiscount(float amount) {
		return amount*0.15f;
	}
}