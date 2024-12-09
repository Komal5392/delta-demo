//"Assignment 5 Find Area of Circle using Scanner  class"

//Pi* r*r
package ab46;

import java.util.Scanner;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=3.14;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radius to calculate area of circle");
		int r=scan.nextInt();
		double Area=PI*r*r;
		System.out.println(Area);
	}
}