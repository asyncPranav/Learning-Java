package projects;

import java.awt.*;
import java.awt.event.*;

public class Calculator2 extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1, b2, b3, b4;
    Label l;

    Calculator2() {
        super("Calculator");

        // Frame background
        Color bgColor = new Color(30, 30, 30);
        setBackground(bgColor);

        // Font setup
        Font fieldFont = new Font("Consolas", Font.PLAIN, 16);
        Font buttonFont = new Font("Segoe UI", Font.BOLD, 18);
        Font labelFont = new Font("Segoe UI", Font.BOLD, 16);

        // Text Fields (with clean look, no white border)
        t1 = createTextField(20, 40, 260, 35, fieldFont);
        t2 = createTextField(20, 90, 260, 35, fieldFont);

        // Buttons
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("×");
        b4 = new Button("÷");

        Button[] buttons = {b1, b2, b3, b4};
        int x = 20;
        for (Button b : buttons) {
            b.setBounds(x, 160, 60, 35);
            b.setBackground(new Color(45, 45, 60));
            b.setForeground(Color.CYAN);
            b.setFont(buttonFont);
            b.setFocusable(false);
            b.addActionListener(this);
            add(b);
            x += 70;
        }

        // Result Label
        l = new Label("Result : 0", Label.CENTER);
        l.setBounds(20, 230, 260, 35);
        l.setBackground(new Color(50, 50, 65));
        l.setForeground(new Color(144, 238, 144)); // Light green
        l.setFont(labelFont);
        add(l);

        // Window Close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Frame setup
        setLayout(null);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private TextField createTextField(int x, int y, int w, int h, Font font) {
        TextField tf = new TextField();
        tf.setBounds(x, y, w, h);
        tf.setFont(font);
        tf.setBackground(new Color(40, 40, 50));  // dark but slightly different from frame
        tf.setForeground(Color.WHITE);
        tf.setCaretPosition(0);
        tf.setFocusable(true);
        tf.setEchoChar((char) 0); // No password mode
        add(tf);
        return tf;
    }

    public static void main(String[] args) {
        new Calculator2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            if (e.getSource() == b1) {
                l.setText("Result : " + (n1 + n2));
            } else if (e.getSource() == b2) {
                l.setText("Result : " + (n1 - n2));
            } else if (e.getSource() == b3) {
                l.setText("Result : " + (n1 * n2));
            } else if (e.getSource() == b4) {
                l.setText("Result : " + (n2 != 0 ? (n1 / n2) : "∞"));
            }
        } catch (Exception ex) {
            l.setText("Invalid Input!");
        }
    }
}
