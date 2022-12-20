package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		for(int num = 1; num <= 100; num++) {
			if(num%2 == 1) {
				continue;
			}
			total += num;
		}
		
		System.out.println("total: " + total);
	}

}
