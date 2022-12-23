package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentDoo = new Student(304, "doo");
		Student studentHong = new Student(309, "hong");
		
		studentDoo.addSubject("korean", 96);
		studentDoo.addSubject("math", 96);
		studentDoo.addSubject("English", 92);
		
		studentHong.addSubject("korean", 95);
		studentHong.addSubject("math", 100);
		studentHong.addSubject("English", 90);
		
		studentDoo.showSubjectList();
		System.out.println("=============");
		studentHong.showSubjectList();
	}
	
}
