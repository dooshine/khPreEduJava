package array;

public class ArrayTest {

	public static void main(String[] args) {

//		int[] numbers = new int[10];
		int[] numbers = new int[] {1,2,3};
//		int[] numbers;
//		numbers = new int[3];
//		numbers = {1, 2, 3}; !error!
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int studentIDs[] = new int[10];
		for(int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
	}

}
