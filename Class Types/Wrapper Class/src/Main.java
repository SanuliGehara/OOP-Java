public class Main {
    public static void main(String[] args) {
        Integer num1 = 10;  //auto-boxing - primitive type into wrapper class object

        int value2 = num1.intValue(); // unboxing - object to primitive type
        int value1 = num1; // auto-unboxing

        // Integer -> String -> str.toString()
        String stringNum = Integer.toString(num1);
        System.out.println("String num: "+stringNum);
        System.out.println(stringNum instanceof String);

        // String -> Integer -> Integer.parseInt(str)
        Integer value = Integer.parseInt(stringNum);
        System.out.println(value);
        System.out.println(value instanceof Integer);

        // Boolean wrapper class - double primitive
        Boolean objB = true;  // autoboxing
        boolean primB = objB; //auto-unboxing

        // Double - double
        Double objD = 12.22;
        double obj = objD;
        System.out.println(objD instanceof Double);


    }
}