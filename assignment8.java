//"Assignment 8 Find Area of Square using Scanner class"
//a*a
package ab46;

import java.util.Scanner;

public class assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a to calculate area of square");
		int a=scan.nextInt();
		int area=a*a;
		System.out.println(area);
	}
}