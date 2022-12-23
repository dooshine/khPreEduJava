package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
		int[][] arr = {{1,2,3},{4,5,6}};
		
		// arr.length, arr[0].length 출력
		System.out.println("arr.length: " + arr.length);
		System.out.println("arr[0].length: " + arr[0].length);
		
		// int[] arr 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
			}
		}

		
		// 알파벳을 13행 2열 array에 저장 후 출력
		char[][] alphabet = new char[13][2];
		char alpha = 'A';

//		int[][] alphabet = new int[13][2];
//		int alpha = 100;
		
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = alpha++;
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet[i].length; j++) {
				System.out.println(alphabet[i][j]);
			}
		}
		
		// array의 자료형이
		// char일 때는 char가 연속해서 출력되고,
		// int일 때는 주솟값이 출력된다.
		System.out.println(alphabet[0]);
	}

}
