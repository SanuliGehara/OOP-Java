public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Pig says, Wee wee..");
    }

    @Override
    public void eat(){
        System.out.println("Pig eats everything!");
    }
}
