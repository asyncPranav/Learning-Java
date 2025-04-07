package projects;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class _06_PasswordStrengthChecker extends Frame implements ActionListener {
    Label l;
    TextField tf1, tf2;
    Button b;
    Panel p;

    public _06_PasswordStrengthChecker(){
        super("Password strength checker");

        //font for app
        Font font = new Font("Segoe UI", Font.PLAIN, 14);

        //input
        l = new Label("Enter Password : ");
        l.setFont(font);
        tf1 = new TextField(20);

        //result
        tf2 = new TextField(10);
        tf2.setFont(font);
        tf2.setEditable(false);
        tf2.setVisible(false);

        //button
        b = new Button("Check");
        b.setFont(new Font("Segoe UI", Font.BOLD, 15));
        //b.setBackground(new Color(69, 126, 217));
        b.setBackground(Color.decode("#7A73D1"));
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.addActionListener(this);

        //panel for input
        p = new Panel(new FlowLayout());
        p.add(l);
        p.add(tf1);

        //layout
        GridLayout gl = new GridLayout(3,1);
        setLayout(gl);
        add(p);
        add(b);
        add(tf2);

        //window closing
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        //window settings
        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf2.setVisible(true);
        try{
            if(tf1.getText().length()<=4){
                tf2.setText("Weak Password");
                tf2.setBackground(Color.red);
            }
            else if(tf1.getText().length()<=8){
                tf2.setText("Intermediate Password");
                tf2.setBackground(Color.yellow);
            }
            else{
                tf2.setText("Strong Password");
                tf2.setBackground(Color.green);

            }
        }
        catch(Exception ex){
            tf2.setText("ERROR !!");
        }
    }

    public static void main(String[] args) {
        new _06_PasswordStrengthChecker();
    }
}