package TypeCasting;

public class Bill {
	
	
	private int billId;
	private int customerId;
	private int discount=2;
	private double billAmount;
	
	private double discountedBillAmount;
	
	
	public Bill(int billId, int customerId, double billAmount) {
		this.billId = billId;
		this.customerId = customerId;
		this.billAmount = billAmount;
	}
	
	
	
	public void calculateDiscountedBillAmount() {
		
		discountedBillAmount=billAmount*(1.0 - (discount/100.0f));
	}



	public double getDiscountedBillAmount() {
		return discountedBillAmount;
	}

}
