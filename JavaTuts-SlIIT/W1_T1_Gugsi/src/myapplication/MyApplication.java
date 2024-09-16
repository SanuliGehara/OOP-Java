package myapplication;

public class MyApplication {
    public static void main(String[] args) {
        // Person -> Ben
        Person p1 = new Person("Ben");
        p1.displayName();
        System.out.println();

        // Other 3 people
        Person person1 = new Person("Mary");
        Person person2 = new Person("Luvi");
        Person person3 = new Person("Roy");

        person1.setSurname("Jones");
        person1.setAge(20);

        person2.setSurname("Lores");
        person2.setAge(19);

        person3.setSurname("Melvis");
        person3.setAge(24);

        person1.displayName();
        System.out.print(" " + person1.getSurname() + " " + person1.getAge() + "\n");

        person2.displayName();
        System.out.print(" " + person2.getSurname() + " " + person2.getAge() + "\n");

        person3.displayName();
        System.out.print(" " + person3.getSurname() + " " + person3.getAge());
    }
}
