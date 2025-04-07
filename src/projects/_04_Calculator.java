package projects;

import java.awt.*;
import java.awt.event.*;

public class _04_Calculator extends Frame implements ActionListener {
    TextField tf;
    String operand1 = "", operator = "", operand2 = "";

    public _04_Calculator() {
        super("AWT Calculator");

        // Top text field
        tf = new TextField();
        tf.setFont(new Font("Arial", Font.PLAIN, 20));
        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        // Button panel with GridLayout
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 0, 0));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String label : buttons) {
            Button btn = new Button(label);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setSize(300, 400);
        setVisible(true);
        setLocationRelativeTo(null); // center screen
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) {
            if (operator.equals("")) {
                operand1 += input;
            } else {
                operand2 += input;
            }
            tf.setText(operand1 + operator + operand2);
        } else if (input.matches("[+\\-*/]")) {
            if (!operand1.equals("") && operand2.equals("")) {
                operator = input;
            }
            tf.setText(operand1 + operator);
        } else if (input.equals("=")) {
            try {
                double op1 = Double.parseDouble(operand1);
                double op2 = Double.parseDouble(operand2);
                double result = 0;

                switch (operator) {
                    case "+": result = op1 + op2; break;
                    case "-": result = op1 - op2; break;
                    case "*": result = op1 * op2; break;
                    case "/":
                        if (op2 == 0) {
                            tf.setText("Divide by 0 Error");
                            return;
                        }
                        result = op1 / op2; break;
                }

                tf.setText(operand1 + operator + operand2 + "=" + result);
                operand1 = String.valueOf(result);
                operator = "";
                operand2 = "";

            } catch (Exception ex) {
                tf.setText("Error");
            }
        } else if (input.equals("C")) {
            operand1 = "";
            operator = "";
            operand2 = "";
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new _04_Calculator();
    }
}

