package lab3;

public class InheritanceDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Kamal", "23/4A, Malena Rd, Kottawa.");
        person1.showDetails();

        Student student1 = new Student("Sanuli", "34/78A, Flower Rd, Homagama.", "A001");
        student1.showDetails();

        PartTimeStudent ptStd1 = new PartTimeStudent("Helani", "98/7, Lumini Rd, Galle." , "B007", 8);
        ptStd1.showDetails();
    }
}
