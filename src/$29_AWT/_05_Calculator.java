package $29_AWT;
import java.awt.*;
import java.awt.event.*;

public class _05_Calculator extends Frame implements ActionListener{
    TextField tf1;
    TextField tf2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Label label;

    public _05_Calculator(){
        super("Calculator");
        setLayout(new FlowLayout());

        tf1 = new TextField(5);
        tf2 = new TextField(5);
        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");
        label = new Label("Result : ");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        add(tf1);
        add(tf2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(label);

        setSize(300, 300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int result = 0;

        if(e.getSource()==add){
            result = num1+num2;
        }
        else if(e.getSource()==sub){
            result = num1-num2;
        }
        else if(e.getSource()==mul){
            result = num1*num2;
        }
        else if(e.getSource()==div){
            result = num1/num2;
        }

        label.setText("Result : "+result);
    }

    public static void main(String[] args) {
        _05_Calculator obj = new _05_Calculator();
    }
}