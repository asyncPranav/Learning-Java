package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _15_BorderLayout extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public _15_BorderLayout(){
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        /*FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT); //default center
        fl.setHgap(20);
        fl.setVgap(50);
        setLayout(fl);*/

        //By default, layout of frame is - Border Layout
        //can add only 5 components at max

        add(b1, BorderLayout.NORTH);
        //add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        //add(b6);

        //Panel is also a container whose default layout is flow layout
        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));

        add(p, BorderLayout.EAST);


        setSize(400, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new _15_BorderLayout();
    }
}
