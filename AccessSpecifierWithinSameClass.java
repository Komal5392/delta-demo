/*WAP to access the 4 access specifiers within the same class*/
package ab46;

public class AccessSpecifierWithinSameClass {

	public void add(int a) {
		System.out.println("Public access specifier");
	}
	private void sub() {
		System.out.println("Private access specifier");
	}
	void mul(int a) {
		System.out.println("Default/Package access specifier");
	}
	protected void div() {
		System.out.println("Protected access specifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierWithinSameClass a=new AccessSpecifierWithinSameClass();
		a.add(0);
		a.sub();
		a.div();
		a.mul(0);
	}

}
