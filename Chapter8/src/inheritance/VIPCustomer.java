package inheritance;

public class VIPCustomer extends Customer {

	private double discountRatio;
	private int agentID;	
	
//	public VIPCustomer() {
////		super();
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
////		super.setBonusRatio(0.05);
//		discountRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
//		super.setBonusRatio(0.05);
		discountRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * discountRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public double getBonusRatio() {
//		return super.getBonusRatio();
//	}
}
