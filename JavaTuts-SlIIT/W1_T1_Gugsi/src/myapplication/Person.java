package myapplication;

public class Person {
    private String name;
    private String surname;
    private int age;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Prints name
    public void displayName() {
        System.out.print(this.name);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }
}
