package tutorial2;

public class ConcatTester {
    public static void main(String[] args)
    {
        // String concatenation -> String.concat(), + operator
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        /* Your work goes here */
        System.out.println(animal1.concat(" ").concat(action).concat(" ")
                .concat(article).concat(" ").concat(animal2));
        System.out.println(animal1 + " " + action + " " + article + " " + animal2);
    }
}
