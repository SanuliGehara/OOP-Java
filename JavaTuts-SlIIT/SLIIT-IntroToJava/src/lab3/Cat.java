package lab3;

public class Cat extends Pet{
    private int livesLeft;
    public Cat(String n, String o, int a,
               int l) {
        super(n, o, a);
        this.livesLeft = l;
    }

    public Cat(String n, String o) {
        super(n,o);
        super.age = 0;
        this.livesLeft = 7;
    }
}
