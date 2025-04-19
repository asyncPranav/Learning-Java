package projects;

import java.awt.*;
import java.awt.event.*;

public class StylishCalculator extends Frame implements ActionListener {
    TextField t1, t2;
    Label result;
    Button add, sub, mul, div;

    StylishCalculator() {
        super("🖩 AWT Dark Calculator");

        // Frame
        setSize(340, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(25, 25, 30));
        setResizable(false);

        // Fonts
        Font headingFont = new Font("Segoe UI", Font.BOLD, 20);
        Font fieldFont = new Font("Consolas", Font.PLAIN, 18);
        Font buttonFont = new Font("Segoe UI", Font.BOLD, 16);
        Font resultFont = new Font("Segoe UI", Font.BOLD, 18);

        // Heading
        Label heading = new Label("Simple Calculator", Label.CENTER);
        heading.setBounds(50, 40, 240, 30);
        heading.setFont(headingFont);
        heading.setForeground(Color.CYAN);
        add(heading);

        // Input fields
        t1 = createTextField(50, 90, fieldFont);
        t2 = createTextField(50, 140, fieldFont);
        add(t1);
        add(t2);

        // Buttons
        add = createButton("+", 50);
        sub = createButton("-", 115);
        mul = createButton("×", 180);
        div = createButton("÷", 245);

        add(add);
        add(sub);
        add(mul);
        add(div);

        // Result label
        result = new Label("Result : 0", Label.CENTER);
        result.setBounds(50, 260, 240, 40);
        result.setBackground(new Color(40, 40, 50));
        result.setForeground(new Color(144, 238, 144));
        result.setFont(resultFont);
        add(result);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Make frame visible
        setVisible(true);
    }

    private TextField createTextField(int x, int y, Font font) {
        TextField tf = new TextField();
        tf.setBounds(x, y, 240, 35);
        tf.setBackground(new Color(40, 40, 50));
        tf.setForeground(Color.WHITE);
        tf.setFont(font);
        tf.setCaretPosition(0);
        return tf;
    }

    private Button createButton(String label, int x) {
        Button btn = new Button(label);
        btn.setBounds(x, 200, 50, 40);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btn.setBackground(new Color(60, 63, 65));
        btn.setForeground(Color.CYAN);
        btn.addActionListener(this);
        return btn;
    }

    public static void main(String[] args) {
        new StylishCalculator();
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
