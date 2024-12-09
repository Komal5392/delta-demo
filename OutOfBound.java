package OOPS;

public class OutOfBound {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		a[4]=9;
		a[5]=10;
		try {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index"+ a.length+ "out of bounds for length" +a.length);
		}
	}
}