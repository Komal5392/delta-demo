//Assignment 4 Operators with Non Static  method by using method overloading concepts
package ab46;
public class assignment4 {
	void addition(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	void addition(double a, int b) {
		double sum=a+b;
		System.out.println(sum);
	}
	void addition(int a,int b, int c) {
		int sum= a+b+c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment4 a4=new assignment4();
		a4.addition(5,10);
		a4.addition(5.5,10);
		a4.addition(5,6,10);
	}

}
