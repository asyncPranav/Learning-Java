package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _10_Scrollbar extends Frame implements AdjustmentListener{
    Scrollbar red, green, blue;
    TextField tf;

    public _10_Scrollbar(){
        super("Scrollbar demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf = new TextField(20);

        tf.setBounds(50, 50, 300, 30);
        red.setBounds(50, 100, 300, 15);
        green.setBounds(50, 150, 300, 15);
        blue.setBounds(50, 200, 300, 15);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        setLayout(null);

        add(tf);
        add(red);
        add(green);
        add(blue);

        setSize(400,300);
        setVisible(true);
    }


    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
        tf.setText("R : "+red.getValue()+", G : "+green.getValue()+", B : "+blue.getValue());
    }

    public static void main(String[] args) {
        _10_Scrollbar obj = new _10_Scrollbar();
    }
}
