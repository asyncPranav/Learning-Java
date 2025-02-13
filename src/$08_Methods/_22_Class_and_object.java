package $08_Methods;

class Television{
    private int channel;
    private int volume;
    public void currentChannel(){
        System.out.println("current channel : "+channel);
    }
    public void currentVolume(){
        System.out.println("current volume : "+volume);
    }

}
public class _22_Class_and_object {
    public static void main(String[] args) {
        Television t = new Television();
        t.currentChannel();
        t.currentVolume();
    }
}

//read explanation Doubt 09 - obsidian
