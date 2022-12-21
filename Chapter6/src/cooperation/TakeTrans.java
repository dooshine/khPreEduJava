package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student doo = new Student("Doo", 5000);
		Student hong = new Student("Hong", 10000);

		Bus bus100 = new Bus(100);
		doo.takeBus(bus100);
		doo.showStudentInfo();
		bus100.showInfo();
		
		Subway subway1 = new Subway(1);
		hong.takeSubway(subway1);
		hong.showStudentInfo();
		subway1.showInfo();
	}

}
