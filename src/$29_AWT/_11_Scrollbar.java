package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _11_Scrollbar extends Frame {
    Scrollbar red, green, blue;
    TextField tf;

    public _11_Scrollbar(){
        super("Scrollbar demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf = new TextField(20);

        tf.setBounds(50, 50, 300, 30);
        red.setBounds(50, 100, 300, 15);
        green.setBounds(50, 150, 300, 15);
        blue.setBounds(50, 200, 300, 15);

        setLayout(null);

        add(tf);
        add(red);
        add(green);
        add(blue);

        // Event Listeners
        red.addAdjustmentListener(e -> updateColor());
        green.addAdjustmentListener(e -> updateColor());
        blue.addAdjustmentListener(e -> updateColor());

        setSize(400, 300);
        setVisible(true);

        // Optional: Close window on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void updateColor() {
        int r = red.getValue();
        int g = green.getValue();
        int b = blue.getValue();

        Color color = new Color(r, g, b);
        tf.setBackground(color);
        tf.setText("R: " + r + ", G: " + g + ", B: " + b);
    }

    public static void main(String[] args) {
        new _11_Scrollbar();
    }
}
