package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
//		
//		for(int i = 0 ; i < bookArray2.length; i++) {
//			bookArray2[i].showBookInfo();
//		}
//		
		
		// Book instance 생성 후 bookArray1[]을 bookArray2[]에 deep copy
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i] = new Book();
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		System.out.println();
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		// Book[] bookArray1 print
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		// Book[] bookArray2 print
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = {"Java", "Android", "C"};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
