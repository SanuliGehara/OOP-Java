package lab3;

public class Student extends Person{
    protected String studentId;

    public Student(String name, String address, String studentId) {
        super(name, address);
        this.studentId = studentId;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Student id: " + this.studentId);
    }
}
