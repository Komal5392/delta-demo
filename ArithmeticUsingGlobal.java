/*package ab46;

import java.util.*;
import java.util.Scanner;

public class ArithmaticusingGlobal {

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter value a");
	int a=scan.nextInt();
	System.out.println("Enter value b");
	int b=scan.nextInt();
	
	static void add() {
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub() {
		int sub=a-b;
		System.out.println(sub);
	}
	static void mul() {
		int m1=a*b;
		System.out.println(m1);
	}
	static void div() {
		int m2=a/b;
		System.out.println(m2);
	}
	static void mod() {
		int m3=a%b;
		System.out.println(m3);
	}
	public static void main(String args[]) {
		
	}

}*/

package ab46;

import java.util.Scanner;

public class ArithmeticUsingGlobal {

    // Define static global variables for class-level access
    static int a;
    static int b;

    // Method to initialize values
    static void initialize() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for a:");
        a = scan.nextInt();
        System.out.println("Enter value for b:");
        b = scan.nextInt();
    }

    // Static method for addition
    static void add() {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Static method for subtraction
    static void sub() {
        int sub = a - b;
        System.out.println("Difference: " + sub);
    }

    // Static method for multiplication
    static void mul() {
        int m1 = a * b;
        System.out.println("Product: " + m1);
    }

    // Static method for division
    static void div() {
        if (b != 0) {
            int m2 = a / b;
            System.out.println("Quotient: " + m2);
        } else {
            System.out.println("Error: Division by zero.");
        }
    }

    // Static method for modulus
    static void mod() {
        if (b != 0) {
            int m3 = a % b;
            System.out.println("Remainder: " + m3);
        } else {
            System.out.println("Error: Division by zero.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        initialize(); // Initialize values
        add(); // Perform addition
        sub(); // Perform subtraction
        mul(); // Perform multiplication
        div(); // Perform division
        mod(); // Perform modulus
    }
}

