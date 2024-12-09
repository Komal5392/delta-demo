//"Assignment 9 Find Aea of Rectangle using Scanner class"
//l*b
package ab46;

import java.util.Scanner;

public class assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter breath to calculate area of rectriangle");
		int b=scan.nextInt();
		System.out.println("enter length to calculate area of rectriangle");
		int l=scan.nextInt();
		int area=l*b;
		System.out.println(area);
	}
}