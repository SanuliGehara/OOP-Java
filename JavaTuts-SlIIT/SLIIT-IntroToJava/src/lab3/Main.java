package lab3;

public class Main {
    public static void main(String[] args){
        Pet p = new Pet("Lissie","Smith",3);
        p.showDetails();
        Cat c = new Cat("Kyan", "Silva", 4, 4);
        c.showDetails();

        Pet p2 = new Pet("Kitty", "John");
        p2.showDetails();
        Cat c2 = new Cat("Jane", "Mercus");
        c2.showDetails();

        Dog d1 = new Dog("Tommy", "Marie");
        d1.showDetails();
        Dog d2 = new Dog("Kim", "Kate", 4, 2);
        d2.showDetails();
    }
}
