package ReferenceVariable;

class Example {
    int value;

    Example(int value) {
        this.value = value;
    }
}

public class ReferenceVariable {
    public static void main(String[] args) {
        Example obj1 = new Example(30);
        Example obj2 = obj1; // Both obj1 and obj2 refer to the same object

        obj2.value = 40; // Modify value using obj2
        System.out.println(obj1.value);     // Output: 40 (same object is modified)
    }
}
