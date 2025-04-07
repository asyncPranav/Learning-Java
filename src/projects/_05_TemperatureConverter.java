package projects;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _05_TemperatureConverter extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b;

    public _05_TemperatureConverter(){
        super("Temperature converter");

        //celsius label
        l1 = new Label("Celsius :  ");
        l1.setBounds(50, 50, 65, 30);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //kelvin label
        l2 = new Label("Kelvin :  ");
        l2.setBounds(50, 100, 65, 30);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //celsius tf
        t1 = new TextField(10);
        t1.setBounds(120, 50, 100, 30);

        //kelvin tf
        t2 = new TextField(10);
        t2.setBounds(120, 100, 100, 30);
        t2.setEditable(false);

        //button
        b = new Button(" Convert ");
        b.setBounds(50, 180, 200, 40);
        b.setFont(new Font("Segoe UI", Font.BOLD, 15));
        b.setBackground(Color.orange);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Hand on hover
        b.addActionListener(this);

        //layout
        setLayout(null);

        //add components
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        //close window
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        //window settings
        setSize(300, 280);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double kelvin = Double.parseDouble(t1.getText())+273.15;
            t2.setText(""+kelvin);
        }
        catch (Exception ex){
            t2.setText("Error");
        }

    }

    public static void main(String[] args) {
        new _05_TemperatureConverter();
    }
}