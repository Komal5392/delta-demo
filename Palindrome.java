//Write a program where to check the given strings are palindrome or not.
package ab46;

public class Palindrome {

	public static void main(String[] args) {
		String s="MOM";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
		if (s1.equals(s)) {
			System.out.println("it is palindrone");
		}
		else {
			System.out.println("It is not palindrone");
			}
		}
	}
