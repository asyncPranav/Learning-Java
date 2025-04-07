package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _06_CheckboxRadio extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3, c4, c5, c6;
    CheckboxGroup cbg;

    public _06_CheckboxRadio(){
        super("Checkbox");
        l = new Label("Nothing is selected : ");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("Cobol");

        cbg = new CheckboxGroup();
        c4 = new Checkbox("Rust",false, cbg);
        c5 = new Checkbox("Swift",false, cbg);
        c6 = new Checkbox("Dart",false, cbg);

        setLayout(new FlowLayout());

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
        c6.addItemListener(this);
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);

        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(c1.getState()){
            str += c1.getLabel();
        }
        if(c2.getState()){
            str += c2.getLabel();
        }
        if(c3.getState()){
            str += c3.getLabel();
        }
        if(c4.getState()){
            str += c4.getLabel();
        }
        if(c5.getState()){
            str += c5.getLabel();
        }
        if(c6.getState()){
            str += c6.getLabel();
        }
        if(str.isEmpty()){
            str = "Nothing is selected : ";
        }
        l.setText(str);
    }

    public static void main(String[] args) {
        _06_CheckboxRadio obj = new _06_CheckboxRadio();
    }
}