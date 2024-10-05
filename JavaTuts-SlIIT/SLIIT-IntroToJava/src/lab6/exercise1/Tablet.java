package lab6.exercise1;

public class Tablet extends Item{
    private String brand;
    private String model;
    private String camera;

    public Tablet(String itemNo, String name, int qty, double unitPrice, String brand, String model, String camera) {
        super(itemNo, name, qty, unitPrice);
        this.brand = brand;
        this.model = model;
        this.camera = camera;
    }

    @Override
    public void printLine() {
        System.out.println("Name: "+ super.name+ ", ItemNo: "+ super.itemNo+
                ", unitPrice: "+ super.unitPrice+ ",Quantity: "+qty+ ", Brand: "+brand+", Model: "+ model+ ", camera: "+ camera);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Camera: "+ camera);
    }
}
