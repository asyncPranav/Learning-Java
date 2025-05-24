package $19_MultiThreading;

class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // 1 second = 1000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Good Morning Thread interrupted.");
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // 2 seconds = 2000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Hello Thread interrupted.");
            }
        }
    }
}

public class _10_TwoThreadTask {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();

        t1.start(); // Starts Good Morning thread
        t2.start(); // Starts Hello thread
    }
}

