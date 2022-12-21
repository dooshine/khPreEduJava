package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus() {}
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void takePassenger(int money) {
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 현재 승객은 " +
	passengerCount + "명이고, 현재 작액은 " + money + "원 입니다.");
	}
}
