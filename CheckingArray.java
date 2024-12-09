package ab46;

import java.util.Scanner;

public class CheckingArray {

	public static void main(String[] args) {
		int student[]=new int[4];
		//Scanner scan=new Scanner(System.in);
		//int student[0]=scan.nextInt();
		student[0]=70;
		student[1]=78;
		student[2]=96;
		student[3]=74;
		
		int numToCheck=34;
		for (int i=0;i<student.length;i++) {
			if(numToCheck==student[i]) {
				System.out.println("value is part of given array");
			}
			else {
				System.out.println("Not");
			}
		}
	}

}