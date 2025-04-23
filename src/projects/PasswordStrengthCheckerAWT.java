package projects;

import java.awt.*;
import java.awt.event.*;

public class PasswordStrengthCheckerAWT extends Frame implements KeyListener {

    TextField passwordField;
    Label strengthLabel;
    TextArea suggestionsArea;

    Color bgColor = new Color(240, 248, 255);   // soft pastel blue
    Color panelColor = new Color(255, 255, 255); // white
    Color weakColor = new Color(255, 102, 102);  // soft red
    Color mediumColor = new Color(255, 204, 102); // soft orange
    Color strongColor = new Color(102, 204, 102); // soft green

    PasswordStrengthCheckerAWT() {
        setTitle("Password Strength Checker");
        setSize(500, 320);
        setLayout(new BorderLayout(10, 10));
        setBackground(bgColor);

        Label header = new Label("Password Strength Checker", Label.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 20));
        header.setBackground(bgColor);
        header.setForeground(new Color(25, 118, 210));
        add(header, BorderLayout.NORTH);

        Panel inputPanel = new Panel(new GridLayout(2, 1, 5, 10));
        inputPanel.setBackground(bgColor);
        inputPanel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        inputPanel.setPreferredSize(new Dimension(400, 100));

        passwordField = new TextField(30);
        passwordField.setEchoChar('*');
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordField.addKeyListener(this);

        strengthLabel = new Label(" Type a password...", Label.CENTER);
        strengthLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        strengthLabel.setBackground(panelColor);

        inputPanel.add(passwordField);
        inputPanel.add(strengthLabel);

        Panel inputWrapper = new Panel(new FlowLayout(FlowLayout.CENTER));
        inputWrapper.setBackground(bgColor);
        inputWrapper.add(inputPanel);
        add(inputWrapper, BorderLayout.CENTER);

        suggestionsArea = new TextArea(4, 50);
        suggestionsArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        suggestionsArea.setBackground(panelColor);
        suggestionsArea.setEditable(false);

        Panel suggestionWrapper = new Panel(new FlowLayout(FlowLayout.CENTER));
        suggestionWrapper.setBackground(bgColor);
        suggestionWrapper.add(suggestionsArea);

        add(suggestionWrapper, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setResizable(false);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {
        String password = passwordField.getText();
        int strength = evaluateStrength(password);
        updateUI(strength, password);
    }

    private int evaluateStrength(String password) {
        int score = 0;
        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[!@#$%^&*()_+=<>?/{}~`|\\\\\\[\\]].*")) score++;
        return score;
    }

    private void updateUI(int score, String password) {
        String strengthText;
        Color color;
        StringBuilder tips = new StringBuilder();

        if (score <= 2) {
            strengthText = " Weak";
            color = weakColor;
            tips.append(" > Use at least 8 characters\n");
            tips.append(" > Include uppercase letters\n");
            tips.append(" > Add numbers and symbols");
        } else if (score == 3 || score == 4) {
            strengthText = " Moderate";
            color = mediumColor;
            tips.append(" > Add more symbols or digits\n");
            tips.append(" > Try using random characters");
        } else {
            strengthText = " Strong";
            color = strongColor;
            tips.append(" > This is a strong password !");
        }

        strengthLabel.setText(" Strength: " + strengthText);
        strengthLabel.setBackground(color);
        suggestionsArea.setText(tips.toString());
    }

    public static void main(String[] args) {
        new PasswordStrengthCheckerAWT();
    }
}
