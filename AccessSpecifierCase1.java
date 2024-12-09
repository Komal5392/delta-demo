package ab46;

public class AccessSpecifierCase1 {
	public void add(){
		System.out.println("Public access specifier");
	}
	private void sub(){
		System.out.println("Private access specifier");
	}
	void mul(){
		System.out.println("Default access specifier");
	}
	protected void div(){
		System.out.println("Protected access specifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierCase1 c=new AccessSpecifierCase1();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}