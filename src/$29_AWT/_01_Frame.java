package $29_AWT;
import java.awt.*;

public class _01_Frame {
    public static void main(String[] args) {
        Frame f = new Frame("Redxcyber");
        f.setLayout(new FlowLayout());
        Button b = new Button("Submit");
//        f.setBackground(Color.decode("#202020"));
        Label l = new Label("Message : ");
        TextField tf = new TextField(20);


        f.add(l);
        f.add(tf);
        f.add(b);
//        f.setUndecorated(true);
//        f.setOpacity(0.9F);
        f.setSize(300, 500);
        f.setVisible(true);
    }
}

