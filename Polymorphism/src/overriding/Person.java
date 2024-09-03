package overriding;

public class Person {
    private String name;
    private static int persontCount;

    // constructor
    public Person(String name) {
        persontCount ++;
        this.name = name;
    }

    // get the person name
    public String getName() {
        return this.name;
    }

    // get total person count
    public static int getPersontCount() {
        return persontCount;
    }

    public void getInfo() {
        System.out.println("Person name: " + getName());
        System.out.println("Total Person count: " + getPersontCount());
    }
}

