package projects;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class Calculator3 extends Frame implements ActionListener {
    TextField input;
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    boolean operatorPressed = false;

    public Calculator3() {
        setTitle("Calculator");

        // Input Panel
        Panel inputPanel = new Panel(new BorderLayout());
        input = new TextField();
        input.setEditable(false);
        input.setFont(new Font("Arial", Font.BOLD, 24));
        input.setBackground(new Color(255, 255, 255)); // Light background for textfield
        input.setForeground(new Color(0, 0, 0)); // Black text for good contrast
        inputPanel.setPreferredSize(new Dimension(300, 60));
        inputPanel.add(input, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);

        // Buttons
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(5, 4));

        String[] buttons = {
                "C", "%", "<", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "+",
                "1", "2", "3", "-",
                "00", "0", ".", "="
        };

        // Loop through the buttons and set colors and actions
        for (String text : buttons) {
            Button b = new Button(text);
            b.setFont(new Font("Arial", Font.PLAIN, 20));
            b.setForeground(Color.WHITE);

            // Set button colors based on button type
            if ("C%</*+-=".contains(text)) {
                b.setForeground(new Color(17, 155, 173));
            } else {
                b.setForeground(Color.black);
            }
            b.addActionListener(this);
            panel.add(b);
        }

        add(panel, BorderLayout.CENTER);

        // Window settings
        setSize(280, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String current = input.getText();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            input.setText(current + command);
        } else if (command.equals("C")) {
            input.setText("");
            operatorPressed = false;
        } else if (command.equals("<")) {
            if (!current.isEmpty()) {
                input.setText(current.substring(0, current.length() - 1)); // Backspace logic
            }
        } else if (command.equals("=")) {
            try {
                String[] parts;

                if (operatorPressed && current.contains(String.valueOf(operator))) {
                    // Split the string by the operator, using Pattern.quote to safely split by operator
                    parts = current.split(Pattern.quote(String.valueOf(operator)));

                    if (parts.length == 2) {
                        num1 = Double.parseDouble(parts[0]);
                        num2 = Double.parseDouble(parts[1]);

                        switch (operator) {
                            case '+': result = num1 + num2; break;
                            case '-': result = num1 - num2; break;
                            case '*': result = num1 * num2; break;
                            case '/':
                                if (num2 != 0) result = num1 / num2;
                                else {
                                    input.setText("Error");
                                    return;
                                }
                                break;
                            case '%': result = num1 % num2; break; // Modulus handling
                        }
                        input.setText("" + result);
                        operatorPressed = false;
                    }
                }
            } catch (Exception ex) {
                input.setText("Error");
            }
        } else {
            // Add operator only once
            if (!operatorPressed && current.length() > 0) {
                input.setText(current + command);
                operator = command.charAt(0);
                operatorPressed = true;
            }
        }
    }

    public static void main(String[] args) {
        new Calculator3();
    }
}