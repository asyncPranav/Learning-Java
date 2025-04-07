package $29_AWT;
import java.awt.*;

class MyFrame extends Frame{
    Label l;
    TextField tf;
    Button b;

    public MyFrame(){
        super("Redxcyber");
        setLayout(new FlowLayout());

        l = new Label("Message");
        tf = new TextField(20);
        b = new Button("Submit");

        add(l);
        add(tf);
        add(b);

        /* ---> do here or in main

                setSize(300, 300);
                setVisible(true);
        */
    }
}
public class _02_CustomFrame {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
}
