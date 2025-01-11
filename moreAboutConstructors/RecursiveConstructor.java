package moreAboutConstructors;

//This makes an infinite loop - Compilation error
//Example() {
//    this(); // This is Recursive constructor call - SO COMPILE TIME ERROR
//    System.out.println("No-argument constructor");
//}

class Example {
    Example() {
        this(5); // Calls parameterized constructor
        System.out.println("No-argument constructor");
    }

    Example(int value) {
        this(value, "Default String"); // Calls another overloaded constructor
        System.out.println("One-argument constructor: " + value);
    }

    Example(int value, String text) {
        System.out.println("Two-argument constructor: " + value + ", " + text);
    }
}

public class RecursiveConstructor {
    public static void main(String[] args) {
        Example obj = new Example();
        // Output:
        // Two-argument constructor: 5, Default String
        // One-argument constructor: 5
        // No-argument constructor
    }
}
