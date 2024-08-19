public class Motorcycle extends Vehical{
    private double engineDisplacement;

    public Motorcycle(double engineDisplacement, String make, String model, int year, String fuelType, double fuelEfficency) {
        super(make, model, year, fuelType, fuelEfficency);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double fuelEfficency() {
        return getFuelEfficency() * (1.0 / (1.0 + (getEngineDisplacement()/1000.0)));
    }

    @Override
    public double distanceTraveled() {
        return fuelEfficency() * getFuelEfficency();
    }

    @Override
    public double maxSpeed() {
        return 80.0;
    }
}
