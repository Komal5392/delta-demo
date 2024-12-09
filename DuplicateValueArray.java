//Write a program to check whether the array accepts duplicate value or not
package ab46;

import java.util.Arrays;

public class DuplicateValueArray {
	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 5;
		a[1] = 6;
		a[2] = 7;
		a[3] = 6;
		// a[3]=9;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			for (int j =i+1; j < a.length; j++) {
				//System.out.println(a[i]);//5
				if(a[i]==a[j]) {

					System.out.println(a[i]+" The Duplicated value found at the index position "+i);
				}
				
			}
		}
		
	}
}
