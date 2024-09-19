package lab3;

public class Test_Exc1 {
    public static void main(String[] args) {
        Student_Exc1 std1 = new Student_Exc1("Sanuli", 0001, "36/3/1, Sooriya Road, Homagama.");
        Student_Exc1 std2 = new Student_Exc1("Helani", 0002, "90A/1, Flower Road, Nugegoda.");

        System.out.println("Std1 Name: "+ std1.getName() + "\nAddress: " + std1.getAddress());
        System.out.println("\nStd1 Name: "+ std2.getName() + "\nAddress: " + std2.getAddress());;
    }
}
