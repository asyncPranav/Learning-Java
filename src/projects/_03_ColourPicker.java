package projects;

import java.awt.*;
import java.awt.event.*;

public class _03_ColourPicker extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    Label redLabel, greenLabel, blueLabel, rgbLabel;
    Panel colorPreview;

    public _03_ColourPicker() {
        super("Color Picker");

        setLayout(null);
        setBackground(new Color(240, 240, 240));

        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Font valueFont = new Font("Consolas", Font.PLAIN, 13);

        // Color preview panel
        colorPreview = new Panel();
        colorPreview.setBackground(Color.BLACK);
        colorPreview.setBounds(50, 60, 300, 100);
        add(colorPreview);

        // RGB label
        rgbLabel = new Label("RGB(0, 0, 0)", Label.CENTER);
        rgbLabel.setBounds(50, 165, 300, 25);
        rgbLabel.setFont(labelFont);
        add(rgbLabel);

        // Labels
        redLabel = new Label("Red");
        greenLabel = new Label("Green");
        blueLabel = new Label("Blue");

        redLabel.setFont(labelFont);
        greenLabel.setFont(labelFont);
        blueLabel.setFont(labelFont);

        redLabel.setBounds(50, 200, 50, 20);
        greenLabel.setBounds(50, 240, 50, 20);
        blueLabel.setBounds(50, 280, 50, 20);

        // Scrollbars
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);

        red.setBounds(110, 200, 240, 15);
        green.setBounds(110, 240, 240, 15);
        blue.setBounds(110, 280, 240, 15);

        // Add components
        add(redLabel);
        add(greenLabel);
        add(blueLabel);
        add(red);
        add(green);
        add(blue);

        // Add listeners
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        // Window settings
        setSize(410, 350);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null); // Center on screen

        // Close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r = red.getValue();
        int g = green.getValue();
        int b = blue.getValue();

        Color color = new Color(r, g, b);
        colorPreview.setBackground(color);
        rgbLabel.setText("RGB(" + r + ", " + g + ", " + b + ")");
    }

    public static void main(String[] args) {
        new _03_ColourPicker();
    }
}
