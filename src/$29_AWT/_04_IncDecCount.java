package $29_AWT;
import java.awt.*;
import java.awt.event.*;

public class _04_IncDecCount extends Frame implements ActionListener{
    int count = 0;
    Label label;
    Button incButton;
    Button decButton;

    public _04_IncDecCount(){
        super("Inc Dec Counter");
        setLayout(new FlowLayout());

        label = new Label(" "+count+" ");
        incButton = new Button("Increment");
        decButton = new Button("Decrement");

        add(label);
        add(incButton);
        add(decButton);

        incButton.addActionListener(this);
        decButton.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==incButton){
            count++;
        }
        else if(e.getSource()==decButton){
            count--;
        }
        label.setText(" "+count+" ");
    }

    public static void main(String[] args) {
        _04_IncDecCount obj = new _04_IncDecCount();
    }
}
