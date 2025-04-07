package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _07_TextField extends Frame implements TextListener, ActionListener{
    Label l1 , l2;
    TextField tf;

    public _07_TextField(){
        super("Textfield demo");
        l1 = new Label("No text is entered here");
        l2 = new Label("Enter key did not hit yet");
        tf = new TextField(20);
        tf.setEchoChar('*');

        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);

        setSize(400,200);
        setVisible(true);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }

    public static void main(String[] args) {
        _07_TextField obj = new _07_TextField();
    }
}
