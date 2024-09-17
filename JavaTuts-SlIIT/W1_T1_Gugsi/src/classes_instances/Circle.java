package classes_instances;

public class Circle {
    private double radius;
    private String color;

    // constructor with no arguments
    public Circle() {
        radius = 1;
        color = "Blue";
    }

    // constructor with one parameter
    public Circle(double r) {
        radius = r;
        color = "Blue";
    }

    // constructor with two parameters
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // getters
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius* Math.PI;
    }

    public String getColor() {
        return this.color;
    }

    // setters
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }
}