public class Dog implements Animal{
    private String name;

    //Constructor
    Dog(String name){
        this.name = name;
    }

    public void showName(){
        System.out.println("Dog's name: "+ this.name);
    }

    @Override
    public void animalSound() {
        System.out.println("Dog says, Bow boww..");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats only meats!");
    }
}
