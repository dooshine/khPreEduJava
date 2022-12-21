package reference;

public class Student {

	int studentID;
	String studentName;

	Subject korean; //= new Subject();
	Subject math; // = new Subject();
	Subject english; // = new Subject();
	
	public Student() {
		korean = new Subject("국어");
		math = new Subject("수학");
		english = new Subject("영어");
	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;

		korean = new Subject("국어");
		math = new Subject("수학");
		english = new Subject("영어");
	}
	
	public void setKorean(int score) {
//		korean.setSubjectName(name);
		// korean.subjectName = name;
		korean.setScore(score);
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	public void setEnglish(int score) {
		english.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korean.getScore()+math.getScore()+english.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
//	public void showTotalScore() {
//		System.out.println((korean.getScore()+math.getScore()+english.getScore()))
//	}
}
