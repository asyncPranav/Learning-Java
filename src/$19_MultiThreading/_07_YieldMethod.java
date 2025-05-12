package $19_MultiThreading;

class YieldMethod extends Thread{
    @Override
    public void run() {
        for(int i=0; true; i++){
            System.out.println(i+" Thread");
        }
    }
}
public class _07_YieldMethod {
    public static void main(String[] args) {
        YieldMethod t = new YieldMethod();
        t.start();

        for(int i=0; true; i++){
            System.out.println(i+" Main");
            Thread.yield();
            // here main thread is yielding means it will wait for sometime
            // in whichever thread we write yield() , that thread will allow other thread for execution
            // so more time will be given to "thread" as compared to "main"
            // "thread" will get more cpu time
            // The main thread is calling yield(), which hints to the scheduler that it is willing to pause
            // and allow other threads of the same priority (like 't') to execute.
            // This increases the chances that the 'YieldMethod' thread gets more CPU time than the main thread.
            // Note: Actual behavior depends on the JVM and operating system scheduler.

        }
    }
}
