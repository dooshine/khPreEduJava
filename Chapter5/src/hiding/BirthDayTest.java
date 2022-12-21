package hiding;

class BirthDay {

	private int year;
	private int month;
	private int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		if(this.month == 2) {
			if( day < 1 || day > 28 ) {
				System.out.println("2월은 1일부터 28일까지 있습니다.");
			}
		} else {
			this.day = day;	
		}
	}
	
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	
	public void showBirthDay() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}

public class BirthDayTest {
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		day.setYear(2018);
		day.setMonth(2);
		day.setDay(29);
		
		day.showBirthDay();
	}
}