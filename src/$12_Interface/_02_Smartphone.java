//in next program we have made this code more interactive
package $12_Interface;

class Phone{
    public void call(){
        System.out.println("calling...");
    }
    public void sms(){
        System.out.println("sending sms...");
    }
}
interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void pause();
    void next();
    void prev();
}
class Smartphone extends Phone implements ICamera, IMusicPlayer{
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
public class _02_Smartphone {
    public static void main(String[] args) {

        //✅ can access all functionalities because Smartphone has all methods.
        Smartphone s = new Smartphone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.next();
        s.prev();
        s.videoCall();
        System.out.println();

        //✅ Can only access Phone methods (call() & sms()).
        //❌ Cannot access click(), record(), play(), etc., because Phone does not declare them.
        Phone p = new Smartphone();
        p.call();
        p.sms();
        System.out.println();

        //✅ Can only access camera-related methods.
        //❌ Cannot access call(), sms(), or music-related methods.
        ICamera c = new Smartphone();
        c.click();
        c.record();

        //✅ Can only access music-related methods.
        //❌ Cannot access call(), sms(), click(), etc.
        IMusicPlayer m = new Smartphone();
        m.play();
        m.pause();
        m.next();
        m.prev();

    }
}
