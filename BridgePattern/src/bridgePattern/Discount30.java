package bridgePattern;

public class Discount30 implements Discount{
	public float calculateDiscount(float amount) {
		return amount*0.30f;
	}
}