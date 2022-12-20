package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		
		for(num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("sum: " + sum);
		System.out.println("num: " + num);
		System.out.println();
		
//		for(int tier = 1; tier < 10; tier ++) {
//			for(int times = 1; times < 10; times++) {
//				System.out.println(tier + "× " + times + "는 " + tier*times);
//			}
//			System.out.println();
//		}
		
		int tier2 = 1;
		int times2 = 1;
		
		while(tier2 <= 9) {
			times2 = 1;
//			continue 예제
//			if(tier2%2 == 1) {
//				tier2++;
//				continue;
//			}
			while(times2 <= 9) {
//				break 예제
//				if(times2 > tier2) {
//					break;
//				}
				System.out.println(tier2 + "×" + times2 + "=" + tier2*times2);
				times2++;
			}
			tier2++;
			System.out.println();
		}
	}

}
