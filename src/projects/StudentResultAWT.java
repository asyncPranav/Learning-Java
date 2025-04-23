package projects;

import java.awt.*;
import java.awt.event.*;

public class StudentResultAWT extends Frame implements ActionListener {

    TextField nameField, sub1Field, sub2Field, sub3Field;
    TextArea outputArea;
    Button calculateButton;

    //color palette
    Color bgColor = new Color(240, 248, 255);
    Color buttonColor = new Color(100, 149, 237);
    Color textColor = new Color(50, 50, 50);

    StudentResultAWT() {
        setTitle(" Student Result Calculator");
        setSize(480, 430);
        setLayout(new BorderLayout(10, 10));
        setBackground(bgColor);

        // Title
        Label header = new Label("Student Result Calculator", Label.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 20));
        header.setForeground(new Color(25, 118, 210));
        header.setBackground(bgColor);
        add(header, BorderLayout.NORTH);

        // Form Panel
        Panel formPanel = new Panel(new GridLayout(4, 2, 12, 15));
        formPanel.setBackground(bgColor);
        formPanel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        formPanel.setPreferredSize(new Dimension(400, 160));

        nameField = new TextField(20);
        sub1Field = new TextField(5);
        sub2Field = new TextField(5);
        sub3Field = new TextField(5);

        formPanel.add(new Label("Student Name :"));
        formPanel.add(nameField);

        formPanel.add(new Label("Hindi Marks :"));
        formPanel.add(sub1Field);

        formPanel.add(new Label("English  Marks :"));
        formPanel.add(sub2Field);

        formPanel.add(new Label("Science Marks :"));
        formPanel.add(sub3Field);

        // This centerWrapper panel provide padding to the formPanel
        Panel centerWrapper = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        centerWrapper.setBackground(bgColor);
        centerWrapper.add(formPanel);
        add(centerWrapper, BorderLayout.CENTER);

        // Bottom section with button + output
        Panel bottomPanel = new Panel(new BorderLayout(10, 10));
        bottomPanel.setBackground(bgColor);

        calculateButton = new Button("  Calculate Result  ");
        calculateButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        calculateButton.setBackground(buttonColor);
        calculateButton.setForeground(Color.WHITE);
        calculateButton.addActionListener(this);

        Panel buttonPanel = new Panel();
        buttonPanel.setBackground(bgColor);
        buttonPanel.add(calculateButton);

        outputArea = new TextArea(6, 48);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 13));
        outputArea.setForeground(textColor);
        outputArea.setEditable(false);

        bottomPanel.add(buttonPanel, BorderLayout.NORTH);
        bottomPanel.add(outputArea, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        //close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String name = nameField.getText().trim();
            int m1 = Integer.parseInt(sub1Field.getText().trim());
            int m2 = Integer.parseInt(sub2Field.getText().trim());
            int m3 = Integer.parseInt(sub3Field.getText().trim());

            int total = m1 + m2 + m3;
            double percentage = total / 3.0;
            String result = (m1 >= 33 && m2 >= 33 && m3 >= 33) ? "Pass" : "Fail";

            outputArea.setText(
                            "  Name     : " + name + "\n" +
                            "  Total    : " + total + " / 300"+ "\n" +
                            "  Percentage  : " + String.format("%.2f", percentage) + "%\n" +
                            "  Result   : " + result
            );
        } catch (NumberFormatException ex) {
            outputArea.setText(" Please enter valid numeric marks.");
        }
    }

    public static void main(String[] args) {
        new StudentResultAWT();
    }
}

