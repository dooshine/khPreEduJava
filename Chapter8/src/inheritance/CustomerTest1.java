package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

//		Customer customerDoo = new Customer();
//		customerDoo.setCustomerID(304);
//		customerDoo.setCustomerName("Doo");
//		
//		System.out.println(customerDoo.showCustomerInfo());
		
		Customer customerHong = new VIPCustomer(309, "Hong", 100);
//		customerHong.setCustomerID(309);
//		customerHong.setCustomerName("Hong");
		
		customerHong.bonusPoint = 1000;

		System.out.println(customerHong.showCustomerInfo());
		
//		System.out.println(customerHong.getBonusRatio());
	}

}
