//"Assignment 19 WAP on Method Overriding"
package ab46;
class Parent_Class{
		void add() {
		System.out.println("This is parent");
	}
}
public	class Child_Class extends Parent_Class{
	void add() {
		System.out.println("This is child");
		super.add();
	}

	public static void main(String args[]) {
		Child_Class c1=new Child_Class();
		c1.add();
	}
}