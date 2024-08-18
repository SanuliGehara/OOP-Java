import java.util.Scanner;

public class AbstractClass_Animal {
    /*Create a Java program that implements an abstract class Animal that has a Name property of type text
    and three methods SetName (string name), GetName and Eat. The Eat method will be an abstract method of type void.

    You will also need to create a Dog class that implements the above Animal class and the Eat method that says the dog is Eating.
    To test the program ask the user for a dog name and create a new Dog type object from the Main of the program, give the Dog object
    a name, and then execute the GetName and Eat methods.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dog name:");

        String dogName = scanner.nextLine();
        Dog newDog = new Dog();
        newDog.setName(dogName);
        System.out.println( newDog.getName());
        newDog.eat();
    }

    public static abstract class Animal {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public abstract void eat();
    }

    public static class Dog extends Animal{
        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }
    }
}