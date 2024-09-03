package overriding;

public class Student extends Person{
    private String stdId;

    public Student(String name, String stdId) {
        super(name);
        this.stdId = stdId;
    }

    public void getInfo() {
        System.out.println("Student(id:" + this.stdId + ") Name: " + super.getName());
        System.out.println("Total Person count: " + getPersontCount());
    }
}
