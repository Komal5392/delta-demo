package OOPS;

import java.util.Arrays;

public class Wrapper_Class {
	static int count_Alphabet;
	public static void main(String[] args) {
		String input="kv no 2 bangalore";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int i=0;i<input.length();i++) {
			boolean b1=Character.isAlphabetic(c1[i]);
			System.out.println(b1);
			if (b1==true) {
				count_Alphabet++;
			}
			
		}
		System.out.println(count_Alphabet);
		
	}
}