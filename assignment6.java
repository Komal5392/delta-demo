//"Assignment 6 Find circumference of circle using Scanner class"

//2*Pi*r
package ab46;

import java.util.Scanner;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=3.14;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radius to calculate area of circle");
		int r=scan.nextInt();
		double Circumference=2*PI*r;
		System.out.println(Circumference);
	}
}