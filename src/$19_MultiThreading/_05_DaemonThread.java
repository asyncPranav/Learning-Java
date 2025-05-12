package $19_MultiThreading;
class DaemonThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println(i);
        }
    }
}
public class _05_DaemonThread {
    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();

        // Set the thread as daemon before starting it
        // This must be done before t.start()
        //you can do same inside DaemonThread class also but for that you will require to create constructor inside DaemonThread class
        t.setDaemon(true);

        // A daemon thread is a background thread.
        // It depends on the user (main) thread.
        // Once the main thread finishes, the JVM terminates daemon threads automatically.
        // If the main thread ends quickly, you may see no output from the daemon thread.
        t.start();

        // Let's stop main method from termination for a while via sleep() method for 1 milli second after starting DaemonThread
        try{
            Thread.sleep(1);
        }catch (Exception e){
            System.out.println(e);
        }

        // This sleep() method stop main() method from terminating and since DaemonThread get started therefore, it will print all numbers until main thread is sleeping, or you can say until main method did not get terminated because DaemonThread will also get terminated as main thread will
    }
}



