package $19_MultiThreading;

class MyRun implements Runnable{
    @Override
    public void run() { }
}

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() { }
}
public class _03_ThreadConstructor {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRun());
        Thread t2 = new Thread(new MyRun(),"My thread 2");
        MyThr t3 = new MyThr("My thread 3");
    }
}
