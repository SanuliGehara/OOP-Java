package lab3;

public class Dog extends Pet{
    int noOfMasters;

    Dog(String n, String o, int a, int m) {
        super(n, o,a);
        this.noOfMasters = m;
    }


    Dog(String n, String o) {
        super(n, o);
        super.age = 0;
        this.noOfMasters = 1;
    }
}
