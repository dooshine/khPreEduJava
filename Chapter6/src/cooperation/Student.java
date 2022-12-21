package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.takePassenger(1000);
		money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.takePassenger(500);
		money -= 500;
	}
	
//	public void takeTrans(Trans trans) {
//		trans.takePassenger();
//	}
	public void showStudentInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
