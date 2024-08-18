public class AbstractClass_Employee {
    /*  Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
    * Create subclasses Manager and  Programmer that extend the Employee class and implement the respective methods to calculate salary and
    * display information for each role.*/

    public static abstract class Employee {
        public abstract void calculateSalary();
        public abstract void displayInfo(String name, int ag);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.displayInfo("Shehan", 40);
        m1.calculateSalary();
        System.out.println();

        Programmer p1 = new Programmer();
        p1.displayInfo("Kamal",30);
        p1.calculateSalary();
    }

    public static class Manager extends Employee{
        @Override
        public void calculateSalary() {
            int salary = 300000;
            System.out.println("Rs."+salary);
        }

        @Override
        public void displayInfo(String name, int age) {
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("Position: Manager");
        }
    }

    public static class Programmer extends Employee{
        @Override
        public void calculateSalary() {
            int salary = 280000;
            System.out.println("Rs."+salary);
        }

        @Override
        public void displayInfo(String name, int age) {
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("Position: Programmer");
        }
    }
}
