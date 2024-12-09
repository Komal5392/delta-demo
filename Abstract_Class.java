package OOPS;
abstract class one{
	abstract void add();
	void eat(){
		System.out.println("Eat");
	}
}
class two extends one{
	void sub() {
		System.out.println("Eat1");
	}

	@Override
	void add() {
		System.out.println("Eat2");
		}
}

public class Abstract_Class {

	public static void main(String[] args) {
		two w=new two();
		w.add();
		w.eat();
		//theard.sleep(3000);
		w.sub();
	}

}
