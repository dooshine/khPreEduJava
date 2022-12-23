package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
/*
		Customer customerDoo = new Customer(304, "Doo");
		int price = customerDoo.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " + customerDoo.showCustomerInfo());
		
		VIPCustomer customerHong = new VIPCustomer(309, "Hong", 100);
		price = customerHong.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " + customerHong.showCustomerInfo());
		*/
	
		Customer customerWho = new VIPCustomer(1000, "Who", 1);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " + customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer(500, "nam");
		
	}

}
