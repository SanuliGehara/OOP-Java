package moreAboutConstructors;

// ALWAYS THE RELEVANT super()/NO args constructor is called inside the subclass constructors - by default
class Example1 {
    int num1;

    Example1() {
        System.out.println("\nFrom: Example1 default Constructor");
    }

    Example1(String message) {   // THIS WON"T USED IN EXAMPLE 2 - PARAMETERIZED CONSTRUCTOR
        System.out.println("\nFrom: Example1 default Constructor| " + message);
    }

}

class Example2 extends Example1{
    //No args constructor
    Example2() {
        //super(); NOT VISIBLE BUT THIS WILL BE EXECUTED   -> From: Example1 default Constructor
        System.out.println("From: Example2 default Constructor");
    }

    // Parameterized constructor
    Example2(String message) {
        //super(); NOT VISIBLE BUT THIS WILL BE EXECUTED -> From: Example1 default Constructor
//        super(message); -> If this line uncommented - only this super constructor will be called - not the super()
        System.out.println("From: Example2 parameterize Constructor| " + message);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Example1 obj1 = new Example1();

        Example2 obj2 = new Example2();

        Example2 obj3 = new Example2("Hello!");
    }
}