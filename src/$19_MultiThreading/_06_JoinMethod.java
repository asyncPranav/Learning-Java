package $19_MultiThreading;

class JoinMeth extends Thread{
    @Override
    public void run() {
        for(int i=0; i<=100; i++){
            System.out.println(i);
        }
    }
}
public class _06_JoinMethod {
    public static void main(String[] args) {
        JoinMeth t = new JoinMeth();
        t.setDaemon(true); //set daemon true -> main thread will not wait
        t.start();

        try {
            t.join();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
