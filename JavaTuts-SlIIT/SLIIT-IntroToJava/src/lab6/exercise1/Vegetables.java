package lab6.exercise1;

public class Vegetables extends Item{
    private boolean organic;
    private  int calories;

    public Vegetables(String itemNo, String name, int qty, double unitPrice, boolean organic, int calories) {
        super(itemNo, name, qty, unitPrice);
        this.organic = organic;
        this.calories = calories;
    }

    @Override
    public void printLine() {
        System.out.println("Name: " + name + ", ItemNo: " + itemNo + ", unit Price: Rs." + unitPrice + ", quantity: "+ qty +
                "g, Organic: "+ organic + ", calories: "+ calories);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Organic: "+ organic );
        System.out.println("Calories: "+ calories);
    }
}
