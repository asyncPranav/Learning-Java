package $19_MultiThreading;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=20; i++){
            System.out.println(i+" : Hello");
        }
    }
}
public class _02_ImplementsRunnable {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        for(int i=1; i<=20; i++){
            System.out.println(i+" : World");
        }
    }
}
