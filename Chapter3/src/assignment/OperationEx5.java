package assignment;

public class OperationEx5 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 11;
		
		int result1 = num1 & num2;
		int result2 = num1 | num2;
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int num3 = 15;
		System.out.println("num3: " + num3);
		System.out.println(num3<<2);
		System.out.println(num3>>1);
	}

}
