package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _14_FlowLayout extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public _14_FlowLayout(){
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT); //default center
        fl.setHgap(20);
        fl.setVgap(50);
        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        setSize(300, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new _14_FlowLayout();
    }
}
