package inheritance;

public class GoldCustomer extends Customer {

	private double discountRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		discountRatio = 0.05;
	}

	@Override
	public int calcPrice(int price) {
		return price - (int)(price * discountRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}
	

}
