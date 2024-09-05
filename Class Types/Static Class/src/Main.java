
/* A Inner Class with static keyword -> Static Class
*  Can't access non-static members of Outer Class (Can't use walk() in Dog object)
*  No need to create outer class object (Can directly call the inner class object) */

class Animal {
    public void walk() {
        System.out.println("Walking...");
    }

    static class Dog {
        /* static method -> Can directly call without creating Inner class object
        *  non-static method -> Need to create inner class object */
        public static void sleep() {
            System.out.println("Dog is sleeping");
        }

        public void eat() {
            System.out.println("Dog is eating meats!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.walk();
//        a1.Dog.sleep() OR a1.sleep() GIVES ERROR;

        // Inner class non-static method -> eat
        Animal.Dog dog1 = new Animal.Dog();
        dog1.eat();

        // static method -> sleep
        Animal.Dog.sleep();
    }
}