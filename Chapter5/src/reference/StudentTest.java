package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentDoo = new Student(304,"Doo");
		Student studentHong = new Student(309,"Hong");
		
		studentDoo.setKorean(10);
		studentDoo.setMath(20);
		studentDoo.setEnglish(30);
		
		studentHong.setKorean(100);
		studentHong.setMath(90);
		studentHong.setEnglish(80);
		
		studentDoo.showStudentInfo();
		studentHong.showStudentInfo();
	}

}
