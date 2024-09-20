package lab4;

public class Student {
    private int studentId;
    private String name;
    private String degree;
    private String mobile;
    static int max;

    static {
        max = 100;
    }

    public Student(String name, String degree, String mobile) {
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
        this.studentId = ++max;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void print() {
        System.out.println("\nStudent Id: " + this.studentId + ", \tName : " +
                this.name + "\nDegree : " + this.degree + ",\tMobile No: " + this.mobile );
    }

    public static int getNextStudentID() {
        return max + 1;
    }
}
