package college;

import java.lang.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1, b2, b3, b4;
    Label l;

    Calculator(){
        super("Calculator");

        //input fields
        t1 = new TextField(30);
        t2 = new TextField(30);
        t1.setBounds(20,40,260, 30);
        t2.setBounds(20,90,260, 30);
        add(t1);
        add(t2);

        //buttons
        b1 = new Button("  Add  ");
        b2 = new Button("  Sub  ");
        b3 = new Button("  Mul  ");
        b4 = new Button("  Div  ");
        b1.setBounds(15, 160, 60, 30);
        b2.setBounds(85, 160, 60, 30);
        b3.setBounds(155, 160, 60, 30);
        b4.setBounds(225, 160, 60, 30);
        b1.setBackground(Color.PINK);
        b2.setBackground(Color.PINK);
        b3.setBackground(Color.PINK);
        b4.setBackground(Color.PINK);
        Font btnFont = new Font("Consolas", Font.BOLD, 14);
        b1.setFont(btnFont);
        b2.setFont(btnFont);
        b3.setFont(btnFont);
        b4.setFont(btnFont);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        //output
        l = new Label("Result : 0",Label.CENTER);
        l.setBounds(20, 230, 260, 30);
        l.setBackground(Color.darkGray);
        l.setForeground(Color.white);
        l.setFont(new Font("Arial", Font.BOLD, 14));
        add(l);




        //window close
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        //frame setting
        setLayout(null);
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(t1.getText());
        double n2 = Double.parseDouble(t2.getText());
        if(e.getSource()==b1){
            l.setText("Result : "+(n1+n2));
        }
        else if(e.getSource()==b2){
            l.setText("Result : "+(n1-n2));
        }
        else if(e.getSource()==b3){
            l.setText("Result : "+n1*n2);
        }
        else if(e.getSource()==b4){
            l.setText("Result : "+n1/n2);
        }
        else{
            l.setText("Invalid Number Passed");
        }
    }
}
