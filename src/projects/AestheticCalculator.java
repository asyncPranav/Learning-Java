package projects;

import java.awt.*;
import java.awt.event.*;

public class AestheticCalculator extends Frame implements ActionListener {
    TextField t1, t2;
    Label result;
    Button add, sub, mul, div;

    AestheticCalculator() {
        super("Calculator");

        // Frame setup
        setSize(300, 390);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(245, 245, 250)); // soft background
        setResizable(false);

        // Fonts
        Font titleFont = new Font("Segoe UI", Font.BOLD, 20);
        Font textFont = new Font("Segoe UI", Font.PLAIN, 16);
        Font buttonFont = new Font("Segoe UI", Font.BOLD, 16);
        Font resultFont = new Font("Segoe UI", Font.BOLD, 18);

        // Title Label
        Label title = new Label("Calculator", Label.CENTER);
        title.setBounds(30, 50, 240, 30);
        title.setFont(titleFont);
        title.setForeground(new Color(80, 80, 120));
        add(title);

        // Input TextFields
        t1 = createTextField(30, 100, textFont);
        t2 = createTextField(30, 150, textFont);
        add(t1);
        add(t2);

        // Buttons
        add = createButton("+", 30, buttonFont);
        sub = createButton("-", 95, buttonFont);
        mul = createButton("×", 160, buttonFont);
        div = createButton("÷", 225, buttonFont);
        add(add);
        add(sub);
        add(mul);
        add(div);

        // Result Label
        result = new Label("Result : 0", Label.CENTER);
        result.setBounds(30, 280, 240, 40);
        result.setBackground(new Color(230, 230, 240));
        //result.setForeground(new Color(60, 100, 100));
        //result.setForeground(new Color(50, 50, 100));
        result.setForeground(new Color(63, 63, 96));
        result.setFont(resultFont);
        add(result);


        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private TextField createTextField(int x, int y, Font font) {
        TextField tf = new TextField();
        tf.setBounds(x, y, 240, 35);
        tf.setBackground(new Color(255, 255, 255));
        tf.setForeground(new Color(50, 50, 50));
        tf.setFont(font);
        return tf;
    }

    private Button createButton(String label, int x, Font font) {
        Button b = new Button(label);
        b.setBounds(x, 210, 50, 40);
        b.setBackground(new Color(200, 220, 240));
        b.setForeground(new Color(40, 40, 70));
        b.setFont(font);
        b.addActionListener(this);
        return b;
    }

    public static void main(String[] args) {
        new AestheticCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add) res = n1 + n2;
            else if (e.getSource() == sub) res = n1 - n2;
            else if (e.getSource() == mul) res = n1 * n2;
            else if (e.getSource() == div) res = (n2 != 0) ? n1 / n2 : Double.POSITIVE_INFINITY;

            result.setText("Result : " + res);
        } catch (Exception ex) {
            result.setText("Invalid Input!");
        }
    }
}
