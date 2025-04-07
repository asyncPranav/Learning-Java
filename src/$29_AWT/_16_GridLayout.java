package $29_AWT;

import java.awt.*;

public class _16_GridLayout extends Frame {
    Button b1, b2, b3, b4, b5, b6, b7;

    public _16_GridLayout(){
        super("GridLayout");

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");
        b7 = new Button("seven");

        GridLayout gl = new GridLayout(3,3);
        gl.setHgap(10);
        gl.setVgap(10);
        setLayout(gl);


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        setSize(300, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new _16_GridLayout();
    }
}
