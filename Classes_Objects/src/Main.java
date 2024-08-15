public class Main {
    public static void main(String[] args) {
        /*
        * Class is a blueprint/ template of an object.
        * Object is an instance of a Class
        * Object is a real world thing with a state, identity and behaviour*/

        Car ourCar = new Car("Audi", "black",4,4);
        Car secondCar = new Car("Benz", "white",4,5);
        Car thirdCar = new Car("BMW", "red",4,4);
        System.out.println(ourCar.name+", "+secondCar.name+", "+ thirdCar.name);
    }
}