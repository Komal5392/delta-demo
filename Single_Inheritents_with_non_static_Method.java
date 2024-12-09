package ab46;

public class Single_Inheritents_with_non_static_Method {
    public static void main(String[] args) {
        Fishs shark = new Fishs(); 
        shark.eat(); // Inherited from Animal
        shark.swim(); // Defined in Fishs
    }
}

// Base class
class Pet{
    public void eat() {
        System.out.println("Eating");
    }
}

// Derived class
class Fishs extends Pet {
    public void swim() {
        System.out.println("Fish is swimming");
    }
}