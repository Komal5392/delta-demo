//Assignment 3 Operators with static method by using method overloading concepts
package ab46;

public class Assignment3 {
	static void addition(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	static void addition(double a, int b) {
		double sum=a+b;
		System.out.println(sum);
	}
	static void addition(int a,int b, int c) {
		int sum= a+b+c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(5,10);
		addition(5.5,10);
		addition(5,6,10);
	}

}
