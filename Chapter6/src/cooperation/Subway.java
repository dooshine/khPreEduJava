package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway() {}
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void takePassenger(int money) {
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 현재 승객은 " +
	passengerCount + "명이고, 현재 작액은 " + money + "원 입니다.");
	}
}
