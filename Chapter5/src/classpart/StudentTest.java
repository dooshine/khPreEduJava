package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentDoo = new Student(304, "두굥기");
//		studentDoo.studentName = "두윤기";
//		studentDoo.studentID = 304;
		studentDoo.address = "서울시 중구";

		Student studentHong = new Student();
		studentHong.studentName = "홍태하";
		studentHong.studentID = 309;
		studentHong.address = "서울시 중구";
		
		studentDoo.showStudentInfor();
		studentHong.showStudentInfor();
		
		System.out.println("studentDoo: " + studentDoo);
		System.out.println("studentHong: " + studentHong);
	}

}
