package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _18_CardLayout extends Frame implements ItemListener {
    Button b1, b2, b3;
    TextField t1, t2, t3;
    Panel p1, p2, mainP, checkP;
    Checkbox c1, c2;
    CardLayout cl;

    public _18_CardLayout(){
        super("CardLayout");

        CheckboxGroup cg = new CheckboxGroup();
        c1 = new Checkbox("one", false, cg);
        c2 = new Checkbox("two", false, cg);

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");

        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(5);

        checkP = new Panel(); //default layout of panel is flow layout
        checkP.add(c1);
        checkP.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainP = new Panel();
        cl = new CardLayout();
        mainP.setLayout(cl);
        mainP.add("one", p1);
        mainP.add("two", p2);

        add(checkP, BorderLayout.NORTH);
        add(mainP, BorderLayout.CENTER);

        c1.addItemListener(this);
        c2.addItemListener(this);

        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState()){
            cl.first(mainP);
        }
        else if(c2.getState()){
            cl.last(mainP);
        }
    }

    public static void main(String[] args) {
        new _18_CardLayout();
    }
}
