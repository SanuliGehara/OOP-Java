class A extends Thread {
    @Override
    public void run() {
        // print from 1 to 100
        for (int i=1; i<=50; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread {
    //print Hello 150 times
    @Override
    public void run() {
        for (int x=0; x<15; x++) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class C extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
        System.out.println("From C");}
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        // Create two objects
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        // Call start method
        obj1.start();
        obj2.start();
        obj3.start();
    }
}