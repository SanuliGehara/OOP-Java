public class AbstractClass_Vehical {
    /*Write a Java program to create an abstract class Vehicle with abstract methods start() and stop().
    Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods for each vehicle type.*/

    public static abstract class Vehical {
        public abstract void start();
        public abstract void stop();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Motorcycle m1 = new Motorcycle();
        m1.start();
        m1.stop();
    }

    public static class Car extends Vehical {
        @Override
        public void start() {
            System.out.println("Car engine started...");
        }

        @Override
        public void stop() {
            System.out.println("Car Stopped!");
        }
    }

    public static class Motorcycle extends Vehical {
        @Override
        public void start() {
            System.out.println("Motorcycle started...");
        }

        @Override
        public void stop() {
            System.out.println("Motorcycle Stopped!");
        }
    }
}
