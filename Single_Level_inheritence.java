//"Single level inheritance by using Static methods"
package ab46;

public class Single_Level_inheritence {
	
	public static void main(String[] args) {
		Fish shark = new Fish() ;
		shark.eat();
	}

}
//base cls
class Animal{
	public void eat() {
		System.out.println("Eating");
	}
}
//derived class
class Fish extends Animal{
	public static void swim() {
		System.out.println("Fish is swim");
	}
}

