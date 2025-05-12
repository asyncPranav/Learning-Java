package $19_MultiThreading;

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=20; i++){
            System.out.println(i+" : Hello");
        }
    }
}
public class _01_ExtendingThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for(int i=1; i<=20; i++){
            System.out.println(i+" : World");
        }

    }
}
