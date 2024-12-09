package ab46B;

class Animal{
	void dog() {
		System.out.println("Dog is barking");
	}
}
public class OvrRiding extends Animal{

	void dog() {
		super.dog();
		System.out.println("Walking");
	}
	public static void main(String[] args) {
		OvrRiding a=new OvrRiding();
		a.dog();

	}

}
