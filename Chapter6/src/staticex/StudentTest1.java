package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student doo = new Student("Doo");
		System.out.println(Student.getSerialNum());
		Student hong = new Student("Hong");
		
		doo.showInfo();
		hong.showInfo();
		
	}

}
