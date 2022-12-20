package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfor() {
		System.out.println("studentName: " + studentName + "\n" + "address: " + address);
	}
	
//	public static void main(String[] args) {
//		
//		Student studentDoo = new Student();
//		studentDoo.studentName = "두윤기";
//		studentDoo.address = "서울시 중구";
//		
//		studentDoo.showStudentInfor();
//	}
}
