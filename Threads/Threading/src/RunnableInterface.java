class Pet implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Pet");}
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Kid implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Kid");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        // Pet object
        Pet obj = new Pet();
        Kid ob2 = new Kid();

        // Thread
        Thread myThread1 = new Thread(obj);
        myThread1.start();

        Thread myThread2 = new Thread(ob2);
        myThread2.start();
    }
}
