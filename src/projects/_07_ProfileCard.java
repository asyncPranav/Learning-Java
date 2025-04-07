package projects;

import java.awt.*;
import java.awt.event.*;

public class _07_ProfileCard extends Frame {
    Label nameLabel, bioLabel;
    Canvas photoCanvas;
    Button editButton;

    public _07_ProfileCard() {
        super("Profile Card");

        // Fonts
        Font nameFont = new Font("Segoe UI", Font.BOLD, 18);
        Font bioFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font btnFont = new Font("Segoe UI", Font.BOLD, 14);

        // Name
        nameLabel = new Label("John Doe", Label.CENTER);
        nameLabel.setFont(nameFont);

        // Bio
        bioLabel = new Label("A passionate Java developer.", Label.CENTER);
        bioLabel.setFont(bioFont);

        // Profile Photo (mock)
        photoCanvas = new Canvas() {
            public void paint(Graphics g) {
                g.setColor(new Color(120, 160, 240));
                g.fillOval(10, 10, 80, 80);
            }
        };
        photoCanvas.setPreferredSize(new Dimension(100, 100));
        photoCanvas.setBackground(Color.LIGHT_GRAY);

        // Edit button
        editButton = new Button("Edit Profile");
        editButton.setFont(btnFont);
        editButton.setBackground(Color.decode("#7A73D1"));
        editButton.setForeground(Color.white);
        editButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Layout setup
        setLayout(new BorderLayout(10, 10));

        Panel centerPanel = new Panel(new GridLayout(3, 1, 5, 5));
        centerPanel.add(nameLabel);
        centerPanel.add(photoCanvas);
        centerPanel.add(bioLabel);

        add(centerPanel, BorderLayout.CENTER);

        Panel btnPanel = new Panel(new FlowLayout());
        btnPanel.add(editButton);
        add(btnPanel, BorderLayout.SOUTH);

        // Window settings
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new _07_ProfileCard();
    }
}

