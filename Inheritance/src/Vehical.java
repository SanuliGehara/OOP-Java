public abstract class Vehical {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficency;

    public Vehical(String make, String model, int year, String fuelType,double fuelEfficency) {
        this.make =  make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficency = fuelEfficency;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelEfficency() {
        return fuelEfficency;
    }

    public void setFuelEfficency(double fuelEfficency) {
        this.fuelEfficency = fuelEfficency;
    }

    // Abstract methods
    public abstract double fuelEfficency();

    public abstract double distanceTraveled();

    public abstract double maxSpeed();
}
