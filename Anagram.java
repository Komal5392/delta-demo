//WAP to find out the alphabates char, digits, spaces, and special char from the given strings.
package ab46;

public class Anagram {
	static int count;
	static int num;
	static int space;

	public static void main(String[] args) {
		String s="My mail i'd is Komalsah943@gmail.com";
		char c[]=s.toCharArray();
		System.out.println(new String (c));
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
//			boolean b1=Character.isAlphabetic(i);
//			boolean b2=Character.isDigit(i);
//			boolean b3=Character.isSpaceChar(i);
			if (Character.isAlphabetic(ch)==true) {
				count++;
			}
			if(Character.isDigit(ch)==true) {
				num++;
			}
			if(Character.isSpaceChar(ch)==true) {
				space++;
			}
		}
		System.out.println(count);
		System.out.println(num);
		System.out.println(space);
		int Special=s.length()-(count+num+space);
		System.out.println(Special);

	}

}
