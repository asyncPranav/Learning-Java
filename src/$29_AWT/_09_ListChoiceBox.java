package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _09_ListChoiceBox extends Frame implements ItemListener, ActionListener{
    List l;
    Choice c;
    TextArea ta;

    public _09_ListChoiceBox(){
        super("List and Choice Boxes");
        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(10,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        setSize(300,300);
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==l){
            ta.setText(l.getSelectedItem());
        }
        else if(e.getSource()==c){
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String[] items = l.getSelectedItems();
        String str = "";

        for(String s : items){
            str += s+"\n";
        }

        ta.setText(str);
    }

    public static void main(String[] args) {
        _09_ListChoiceBox obj = new _09_ListChoiceBox();
    }
}
