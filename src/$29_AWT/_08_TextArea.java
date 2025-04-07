package $29_AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _08_TextArea extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    public _08_TextArea(){
        super("Textarea demo");
        l = new Label("No text entered : ");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");

        b.addActionListener(this);


        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);

        setSize(300,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //l.setText(ta.getSelectedText());
        //ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }


    public static void main(String[] args) {
        _08_TextArea obj = new _08_TextArea();
    }
}
