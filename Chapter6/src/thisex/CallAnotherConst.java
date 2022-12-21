package thisex;

class Person {
	String name;
	int age;
	
	public Person() {
//		int i = 0;
		this("이름없음", 1);
//		this.name = "이름 없음";
//		this.age = 1;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
	
	public void showPersonInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.showPersonInfo();
		System.out.println(p1.returnSelf());
	}
}
