class Television{
    private int channel;
    private int volume;
    public void changeChannel(){}
    public void changeVolume(){}

}
public class test {
    public static void main(String[] args) {
        Television t = new Television();
        Television t1 = new Television();
        Television t2 = new Television();
        t.changeChannel();
        t.changeVolume();
    }
}
