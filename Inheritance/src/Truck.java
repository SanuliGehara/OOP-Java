public class Truck extends Vehical{
    private String type;

    public Truck(String type,String make, String model, int year, String fuelType,double fuelEfficency) {
        super(make, model,year,fuelType,fuelEfficency);
        this.type = type;
    }

    @Override
    public double fuelEfficency() {
        return getFuelEfficency() * (1.0/(1.0 + (4000/1000.0)));
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
