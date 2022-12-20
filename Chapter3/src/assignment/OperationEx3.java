package assignment;

public class OperationEx3 {
	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;	
		boolean value = ( ((num1 = num1 + 10) < 10) && ((i= i+2) > 10) );
		System.out.println("value: " + value);
		System.out.println("num: " + num1);
		System.out.println("i: " + i);

		int num2 = 10;
		int i2 = 2;	
		boolean value2 = ( ((num2 = num2 + 10) > 10) || ((i2= i2+2) > 10) );
		System.out.println("value2: " + value2);
		System.out.println("num2: " + num2);
		System.out.println("i: " + i2);
	}
}
