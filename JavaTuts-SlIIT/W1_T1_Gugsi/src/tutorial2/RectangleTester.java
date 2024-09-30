package tutorial2;

import java.awt.Rectangle;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0,0,100,50);
        System.out.println(r1);

        /* OBJECTS? NON_PRIMITIVE DATATYPE */
        Rectangle r2 = r1;  // refers to same object reference
        //    Rectangle r2 = new Rectangle(r1);     two diff objects

        /* and here */
        r2.grow(10,20);
        System.out.println(r2);
        System.out.println(r1);

        // PRIMITIVE DATA TYPES
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow only n2
        System.out.println("n1: " + n1);
        System.out.println("n2: "+ n2);
    }
}
