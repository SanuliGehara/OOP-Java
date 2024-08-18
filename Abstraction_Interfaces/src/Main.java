public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy");
        myDog.showName();
        myDog.animalSound();
        myDog.eat();

        Pig newPig = new Pig();
        newPig.eat();
        newPig.animalSound();
    }
}