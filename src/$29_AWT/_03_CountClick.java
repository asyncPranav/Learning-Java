package $29_AWT;
import java.awt.*;
import java.awt.event.*;

public class _03_CountClick extends Frame implements ActionListener{
    int count = 0;
    Label l;
    Button b;

    public _03_CountClick(){
        super("Counter App");
        setLayout(new FlowLayout());

        l = new Label("   "+count+"   ");
        b = new Button("Click Me");

        add(l);
        add(b);

        b.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("   "+count+"   ");
    }

    public static void main(String[] args) {
        _03_CountClick obj = new _03_CountClick();
    }

}
