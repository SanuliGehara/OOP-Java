package lab6.exercise1;

public class MainApp {
    public static void main(String[] args) {
        Tablet t1 = new Tablet("T001","Piriton",5,8,"NewlyP","Medicine","c1");
        Tablet t2= new Tablet("T002","Ventolin",10,12,"Crimson","Medicine","vpw");

        Vegetables veg1 = new Vegetables("V001","Carrot",800,90,true,20);
        Vegetables veg2 = new Vegetables("V002","Beens",500,55,true,12);

        IPrint[] itemArray = new IPrint[4];
        itemArray[0]= t1;
        itemArray[1]= t2;
        itemArray[2]= veg1;
        itemArray[3]= veg2;

        for (IPrint item: itemArray) {
            item.printLine();
            System.out.println();
        }
    }
}
