//"Assignment 7 Find Area of Triangle using Scanner class"

//0.5*b*h
package ab46;

import java.util.Scanner;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter breath to calculate area of triangle");
		int b=scan.nextInt();
		System.out.println("enter height to calculate area of triangle");
		int h=scan.nextInt();
		double area=0.2*b*h;
		System.out.println(area);
	}

}
