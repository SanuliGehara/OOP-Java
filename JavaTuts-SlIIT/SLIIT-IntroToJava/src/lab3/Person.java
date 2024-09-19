package lab3;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String  address) {
        this.name = name;
        this.address = address;
    }

    public void showDetails() {
        System.out.println("\nName: " + this.name + "\nAddress: " + this.address);
    }
}
