package staticex;

public class Student {

	private static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student (String studentName) {
		this.studentName = studentName;
		this.studentID = serialNum++;
	}
	
	public static int getSerialNum() {
//		int i = 10; // 지역변수 (method가 호출 될 때, stack memory에 생성, method 끝날 때 제거)
//		i++;
//		System.out.println(i);
		
//		studentName = "good"; // member variable, instance variable
		
		return serialNum; // static variable, class variable
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 학번은 " + studentID + "입니다.");
	}
}
