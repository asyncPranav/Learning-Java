//create two thread, one print numbers from 1 to 10 and another thread will print numbers from 10 to 1

package $19_MultiThreading;

class IncNumThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("Increasing : " + i);
        }
    }
}
public class _09_TwoThreadTask {
    public static void main(String[] args) {
        IncNumThread t = new IncNumThread();
        t.start();

        for(int i=10; i>=1; i--){
            System.out.println("Decreasing : " + i);
        }
    }
}
