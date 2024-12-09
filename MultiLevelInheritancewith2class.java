package ab46;
class Class2{
	void add1(){
		System.out.println("Sum");
	}
}
class Class3 extends Class2{
	void add2() {
		System.out.println("Add");
	}
}
class Class4 extends Class3{
	void add4() {
		System.out.println("Sub");
	}
}

public class MultiLevelInheritancewith2class extends Class4{
	void add3() {
		System.out.println("Addition");
	}
	public static void main(String[] args) {
		MultiLevelInheritancewith2class m=new MultiLevelInheritancewith2class();
		m.add1();
		m.add2();
		m.add3();
		m.add4();
	}

}
