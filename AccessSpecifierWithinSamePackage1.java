//WAP to access the 4 access specifiers within the same Package
package ab46;

public class AccessSpecifierWithinSamePackage1 {
	public void add(int a) {
		System.out.println("Public access specifier");
	}
	/*private void sub() {
		System.out.println("Private access specifier");
	}*/
	void mul(int a) {
		System.out.println("Default/Package access specifier");
	}
	protected void div() {
		System.out.println("Protected access specifier");
	}
}
