package $12_Interface;
import java.util.Scanner;

class Phonee{
    public void call(){
        System.out.println("calling...");
    }
    public void sms(){
        System.out.println("sending sms...");
    }
}
interface ICameraa{
    void click();
    void record();
}
interface IMusicPlayerr{
    void play();
    void pause();
    void next();
    void prev();
}
class Smartphonee extends Phonee implements ICameraa, IMusicPlayerr{
    @Override
    public void click() {
        System.out.println("clicking img...");
    }
    @Override
    public void record() {
        System.out.println("recording video...");
    }
    @Override
    public void play() {
        System.out.println("playing music...");
    }
    @Override
    public void pause() {
        System.out.println("pausing music...");
    }
    @Override
    public void next() {
        System.out.println("skipping to next music...");
    }
    @Override
    public void prev() {
        System.out.println("going back to previous music...");
    }
    public void videoCall(){
        System.out.println("video calling...");
    }
}
public class _03_Smartphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphonee s = new Smartphonee();

        while (true) {
            System.out.println("\n----- Smartphone Menu -----");
            System.out.println("1. Call");
            System.out.println("2. Send SMS");
            System.out.println("3. Click Picture");
            System.out.println("4. Record Video");
            System.out.println("5. Play Music");
            System.out.println("6. Pause Music");
            System.out.println("7. Next Song");
            System.out.println("8. Previous Song");
            System.out.println("9. Video Call");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> s.call();
                case 2 -> s.sms();
                case 3 -> s.click();
                case 4 -> s.record();
                case 5 -> s.play();
                case 6 -> s.pause();
                case 7 -> s.next();
                case 8 -> s.prev();
                case 9 -> s.videoCall();
                case 10 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}