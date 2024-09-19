package lab3;

public class Student_Exc1 {
    private String name;
    private int ditNo;
    private String address;

    // Constructor
    public Student_Exc1(String name, int ditNo, String address) {
        this.name = name;
        this.ditNo = ditNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getDitNo() {
        return ditNo;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDitNo(int ditNo) {
        this.ditNo = ditNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
