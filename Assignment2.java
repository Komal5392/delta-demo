package ab46;

public class Assignment2 {
//Assignment 2 Operators(+,-,*,/,%) using non_static method
	
	 void addition(){
		 int a=5;
		 int b=10;
		 int sum=a+b;
		System.out.println(sum);
	}
	void sub(){
		int a=5;
		int b=10;
		int minus=b-a;
		System.out.println(minus);
	}
	void mul(){
		int a=5;
		int b=10;
		int multi=a*b;
		System.out.println(multi);
	}
	void div(){
		int a=5;
		int b=10;
		int divi=b/a;
		System.out.println(divi);
	}
	void mod(){
		int a=5;
		int b=10;
		int modu=b%a;
		System.out.println(modu);
	}
	public static void main(String args[]) {
		Assignment2 a2=new Assignment2();
		a2.addition();
		a2.sub();
		a2.mul();
		a2.div();
		a2.mod();
	}
}
