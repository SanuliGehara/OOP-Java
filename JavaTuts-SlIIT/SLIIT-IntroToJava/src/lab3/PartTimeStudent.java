package lab3;

public class PartTimeStudent extends Student{
    private int workingHrs;

    public PartTimeStudent(String name, String address, String studentId, int workingHrs) {
        super(name,address,studentId);
        this.workingHrs = workingHrs;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Working Hours(PT) : " + workingHrs);
    }
}
