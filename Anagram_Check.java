package OOPS;

import java.util.Arrays;

public class Anagram_Check {
	public static void main(String[] args) {
		String s1="care";
		String s2="face";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b1=Arrays.equals(c1, c2);
		
		if(b1==true) {
			System.out.println("Given input is anagram");
		}
		else {
			System.out.println("It is not anagram");
		}
	}

}
