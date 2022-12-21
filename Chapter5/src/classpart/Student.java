package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student () {}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println("studentName: " + studentName + "\n" + "address: " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String newName) {
		studentName = newName;
	}
	
//	public static void main(String[] args) {
//		
//		Student studentDoo = new Student();
//		studentDoo.studentName = "두윤기";
//		studentDoo.studentID = 304;
//		studentDoo.address = "서울시 중구";
//
//		Student studentHong = new Student();
//		studentHong.studentName = "홍태하";
//		studentHong.studentID = 309;
//		studentHong.address = "서울시 중구";
//		
//		studentDoo.showStudentInfor();
//		studentHong.showStudentInfor();
//	}
}
