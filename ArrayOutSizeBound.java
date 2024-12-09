//Write a program where you get an array index out of bound exception.
package ab46;

public class ArrayOutSizeBound {

	public static void main(String[] args) {
		int a[]= {12,24,48,56};
//		try {
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		//}
			}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array is out of bound please decrease");
//		}
	}

}
