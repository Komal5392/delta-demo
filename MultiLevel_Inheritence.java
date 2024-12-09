//"Multi level inheritance by using static and Non Static methods by using 4 classes"
package ab46;

public class MultiLevel_Inheritence {

	public static void main(String[] args) {
		Pecoak Pee=new Pecoak();
		Pee.eat();
		Pee.breath();
	}

}
//Base Class
class Bird{
	String color;
	void eat() {
		System.out.println("eats");
	}
	void breath() {
		System.out.println("breath");
	}
}
//Derived class/sub class
class Fly extends Bird{
	int legs;
}

class Pecoak extends Fly{
	String color;
}

