package $19_MultiThreading;

class ThreadMethods extends Thread{
    public ThreadMethods(String name){
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        setPriority(2);
    }
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println(i);
            try {
                Thread.sleep(20);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class _04_ThreadMethods {
    public static void main(String[] args) {
        ThreadMethods t = new ThreadMethods("My thread");

        //get id of thread
        System.out.println("ID : "+t.getId());
        System.out.println("ID : "+t.threadId());

        //get name of thread
        System.out.println("Name : "+t.getName());

        //get priority of thread
        System.out.println("Priority : "+t.getPriority());

        //get state of thread
        System.out.println("State : "+t.getState());

        //get priority of thread
        System.out.println("Is Alive : "+t.isAlive());

        //get state of thread
        System.out.println("State : "+t.getState());

        //get priority of thread
        System.out.println("Is Alive : "+t.isAlive());

        //set priority
        t.setPriority(Thread.MAX_PRIORITY);

        //get priority of thread
        System.out.println("Priority : "+t.getPriority());

        //start thread
        t.start();

        //t.interrupt();

    }
}
