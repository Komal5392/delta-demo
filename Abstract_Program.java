package ab46;
abstract class Dog{
	abstract void sound();
}

abstract class Cat extends Dog{
	abstract void sound();
}

class Concrete extends Cat{
	void Bark() {
		System.out.println("Bark");
	}

	@Override
	void sound() {
		System.out.println("Meow");
		
	}
}

public class Abstract_Program extends Concrete{
	public static void main(String[] args) {
		Abstract_Program ap=new Abstract_Program();
		ap.sound();
		ap.Bark();

	}

}
