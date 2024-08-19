public class Car extends  Vehical{
    private String brand;

    public Car(String brand,String make, String model, int year, String fuelType, double fuelEfficency) {
        super(make, model, year, fuelType, fuelEfficency);
        this.brand = brand;
    }

    @Override
    public double fuelEfficency() {
        return getFuelEfficency() * (1.0 / (1.0 + (6 / 5.0)));
    }

    @Override
    public double distanceTraveled() {
        return fuelEfficency() * getFuelEfficency();
    }

    @Override
    public double maxSpeed() {
        return 120.0;
    }
}
