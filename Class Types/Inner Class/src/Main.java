
class Computer {
    private int version;

    // Instance initializer block
    {
        version = 2022;
    }

    public void show () {
        System.out.println("This Computer's version: " + version);
    }

    // Inner Class
    class Laptop {
        static String model;

        // static initializer block
        static {
            model = "Mac OS";
        }
        public void show() {
            System.out.println("Laptop Model: " + model );
        }
    }
}

public class Main {
    public static void main(String[] args) {
        /* 1. First create Outer Class object
        *  2. Create Inner class object upon outer class object
        *  3. Call Inner Class functions */

        Computer comp = new Computer();
        Computer.Laptop laptop = comp.new Laptop();
        laptop.show(); // Inner class method
        System.out.println(Computer.Laptop.model); // static variable

        comp.show();  // Outer class method
    }
}

