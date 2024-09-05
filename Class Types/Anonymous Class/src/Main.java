
/* Inner Class with no name
*  Use -> using only once (implementing a Interface)
*  No constructor (Because no class name)
*  Here inner class belongs to Main Class (where we declare the class) */

class Person {
    public void show() {
        System.out.println("In Person Show");
    }

}

public class Main {
    public static void main(String[] args) {
        // Create Person object
        Person p1 = new Person();
        p1.show();

        // Create anonymous class to show name and age
        Person p2 = new Person() {
            int age = 18;
            String name = "Sanuli";

            public void show() {
                System.out.println(name + "'s  age: " + age );
            }
        };
        p2.show();
    }
}