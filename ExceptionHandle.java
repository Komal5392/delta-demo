package ab46A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		//Create array define size insert value 
		//Arrayindexoutofbound
		//inputmismatch exception
		
		Scanner scan=new Scanner(System.in);
		
		int arr[]= new int[4] ;
		System.out.print("enter the value");
		try {
		for(int i=0;i<=arr.length;i++) {
			
			arr[i]=scan.nextInt();
		}}
		catch(ArrayIndexOutOfBoundsException b){
			System.out.println("Array boundry is out of bound");
		}
		catch(InputMismatchException i) {
			System.out.println("Input Mismatch Exception");
		}
		
	}

}
