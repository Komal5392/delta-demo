//"WAP on non parametrized super calling statement (within multiple class)"
package ab46;

public class Supercalling_with_Para_multiinheritance {
    public static void main(String[] args) {
        Peacock pee = new Peacock(); // Corrected the class name to "Peacock"
        pee.eat();
        pee.breath();
    }
}

// Base Class
class brds {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breath");
    }
}

// Derived class: Flying
class Flying extends brds {
    int legs;

    // Constructor (optional if no special initialization is needed)
    Flying() {
        super(); // This explicitly calls the constructor of Bird, but it is not needed because Bird has a default constructor.
    }
}

// Final Derived Class: Peacock
class Peacock extends Flying {
    String color;

    // Constructor for Peacock
    Peacock() {
        super(); // Calls the constructor of Flying, which calls Bird's constructor.
    }
}
