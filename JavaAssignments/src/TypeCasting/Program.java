package TypeCasting;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill=new Bill(1001,101,199.99);
		bill.calculateDiscountedBillAmount();
		System.out.printf("%.2f",bill.getDiscountedBillAmount());

	}

}
