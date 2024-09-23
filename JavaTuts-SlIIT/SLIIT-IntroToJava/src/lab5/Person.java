package lab5;

public class Person implements ICompute{
    private String name;
    private double basicSal;
    private double otRate;
    private double otHrs;
    private double netSal;

    public Person(String name, double basicSal, double otHrs, double otRate, double netSal) {
        this.name = name;
        this.basicSal = basicSal;
        this.otHrs = otHrs;
        this.otRate = otRate;
        this.netSal = netSal;
    }

    @Override
    public void calculate() {
        netSal = basicSal + (otRate * otHrs);
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Net Salary: " + netSal);
    }
}
