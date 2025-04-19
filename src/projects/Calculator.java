package projects;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1, b2, b3, b4;
    Label l;

    Calculator() {
        super("Calculator");

        setBackground(new Color(240, 248, 255)); // Light background

        // Input fields
        t1 = new TextField(30);
        t2 = new TextField(30);
        t1.setBounds(20, 40, 260, 30);
        t2.setBounds(20, 90, 260, 30);
        t1.setFont(new Font("Arial", Font.PLAIN, 14));
        t2.setFont(new Font("Arial", Font.PLAIN, 14));
        add(t1);
        add(t2);

        // Buttons
        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");

        Font btnFont = new Font("Segoe UI", Font.BOLD, 14);
        Color btnColor = new Color(135, 206, 250); // Light blue

        Button[] buttons = {b1, b2, b3, b4};
        int x = 20;
        for (Button b : buttons) {
            b.setBounds(x, 160, 60, 30);
            b.setBackground(btnColor);
            b.setFont(btnFont);
            b.setForeground(Color.DARK_GRAY);
            b.addActionListener(this);
            add(b);
            x += 70;
        }

        // Output label
        l = new Label("Result : 0", Label.CENTER);
        l.setBounds(20, 230, 260, 35);
        l.setBackground(new Color(60, 63, 65)); // Dark grey
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Segoe UI", Font.BOLD, 16));
        add(l);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Frame setting
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            if (e.getSource() == b1) {
                l.setText("Result : " + (n1 + n2));
            } else if (e.getSource() == b2) {
                l.setText("Result : " + (n1 - n2));
            } else if (e.getSource() == b3) {
                l.setText("Result : " + n1 * n2);
            } else if (e.getSource() == b4) {
                l.setText("Result : " + (n2 != 0 ? (n1 / n2) : "∞"));
            }
        } catch (Exception ex) {
            l.setText("Invalid Input!");
        }
    }
}
