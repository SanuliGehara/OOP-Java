package lab5;

public class Box implements ICompute{
    private int length, width, height;
    private int volume;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculate() {
        volume = length * width * height;
    }

    @Override
    public void display() {
        System.out.println("Volume: " + volume);
    }
}

class Main {
    public static void main(String[] args) {
        ICompute obj1 = new Person("Danushka",40000, 1000, 5);
        obj1.calculate();
        obj1.display();

        ICompute obj2 = new Box(10, 20, 30);
        obj2.calculate();
        obj2.display();
    }
}
