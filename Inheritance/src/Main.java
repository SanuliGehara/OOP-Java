public class Main {
    public static void main(String[] args) {
        // Truck object
        Truck truck = new Truck("new", "Tatra", "Tatra 810 4x4",2020, "Disel", 8.112);
        // Car object
        Car car = new Car("Audi", "Volswagen", "Virtus", 2021, "Hybrid", 6.123);
        // Motorcycle object
        Motorcycle motorcycle = new Motorcycle(2.1, "Massimo Motor", "Warrior200", 2018, "GASOLINE",7.21);

        System.out.println("Truck Model: "+ truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.fuelEfficency() + "mpg");
        System.out.println("Distance traveled: "+ truck.distanceTraveled() + "miles");
        System.out.println("Max Speed: " + truck.maxSpeed() + "mph\n");

        System.out.println("Car Model: "+ truck.getModel());
        System.out.println("Fuel Efficiency: " + car.fuelEfficency() + "mpg");
        System.out.println("Distance traveled: "+ car.distanceTraveled() + "miles");
        System.out.println("Max Speed: " + car.maxSpeed() + "mph\n");

        System.out.println("Motorcycle Model: "+ motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.fuelEfficency() + "mpg");
        System.out.println("Distance traveled: "+ motorcycle.distanceTraveled() + "miles");
        System.out.println("Max Speed: " + motorcycle.maxSpeed() + "mph\n");

    }
}