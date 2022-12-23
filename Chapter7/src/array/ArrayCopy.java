package array;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {10, 20, 30, 40, 50};
		
		System.arraycopy(a, 2, b, 3, 3);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]: " + b[i]);
		}
	}

}
