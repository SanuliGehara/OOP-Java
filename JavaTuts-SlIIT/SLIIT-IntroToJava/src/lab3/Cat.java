package lab3;

public class Cat extends Pet{
    private int livesLeft;
    public Cat(String n, String o, int a,
               int l) {
        super(n, o, a);
        this.livesLeft = l;
    }
}
