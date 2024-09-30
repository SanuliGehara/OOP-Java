package tutorial2;

public class VendingMachine {
    private int numCans;
    private int numTokens;

    public VendingMachine() {
        this.numCans = 10;
        this.numTokens = 0;
    }

    public VendingMachine(int numCans, int numTokens) {
        this.numCans = numCans;
        this.numTokens = numTokens;
    }

    public void fillUp(int cans) {
        numCans += cans;
    }

    public void insertToken() {
        numCans--;
        numTokens++;
    }

    public int getCanCount() { return  this.numCans;}

    public int getTokenCount() { return this.numTokens; }
}
