package strategyPattern;

public class StoreLevelDiscount implements Discount {
	
	float baseAmount;
	float discountAmount;
	
	public StoreLevelDiscount(float baseAmount , float discountAmount) {
		this.baseAmount = baseAmount;
		this.discountAmount = discountAmount;
	}
	public float applyDiscount(float amount) {
		return (amount >= baseAmount) ? discountAmount : 0f;
	}
}