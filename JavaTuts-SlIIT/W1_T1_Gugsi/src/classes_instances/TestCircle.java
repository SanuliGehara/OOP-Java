package classes_instances;

public class TestCircle {
    public static void main(String[] args) {
        // Create circle instance
        Circle circle = new Circle();
        System.out.println("The circle1 has radius of " + circle.getRadius() +
                " and area of " + circle.getArea());

        // Circle2
        Circle circle2 = new Circle(8);
        System.out.println("The circle2 has radius of " + circle2.getRadius() +
                " and area of " + circle2.getArea());

        // Circle 3
        Circle circle3 = new Circle(4, "Red");
        System.out.println("The circle3 has radius of " + circle3.getRadius() +
                " and area of " + circle3.getArea());

        circle2.setColor("Yellow");

        // Print color of te circles
        System.out.println("\nCircle 1 is " + circle.getColor() + " color");
        System.out.println("Circle 2 is " + circle2.getColor() + " color");
        System.out.println("Circle 3 is " + circle3.getColor() + " color");


    }
}
