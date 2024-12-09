//Write a program on reverse a string.
package ab46;

public class ReverseString1 {

	public static void main(String[] args) {
		String s="Komal";
		String s1="";
		
		//char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}

}
