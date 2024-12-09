//Write a program where you get Negative Array size exception.
package ab46;

public class NegativeArray {

	public static void main(String[] args) {
		int a[]=new int[-4];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		//a[3]=9;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
