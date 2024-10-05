package lab6.exercise1;

public abstract class Item implements IPrint{
    protected String itemNo;
    protected String name;
    protected double unitPrice;
    protected int qty;

    @Override
    public void printLine() {
        System.out.println("Name: " + name + ", ItemNo: " + itemNo + ", unit Price: " + unitPrice + ", quantity: "+ qty );

    }

    @Override
    public void printDetails() {
        System.out.println("Name: "+ name);
        System.out.println("Item No: "+ itemNo);
        System.out.println("Unit Price: "+ unitPrice);
        System.out.println("Quantity: "+ qty);
    }

    public Item(String itemNo, String name, int qty, double unitPrice) {
        this.itemNo = itemNo;
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}
