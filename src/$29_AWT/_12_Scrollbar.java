package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _12_Scrollbar extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    Label redLabel, greenLabel, blueLabel, rgbValueLabel;
    Panel colorPreview;

    public _12_Scrollbar() {
        super("AWT Color Mixer");

        // Scrollbars
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);

        // Labels
        redLabel = new Label("Red:");
        greenLabel = new Label("Green:");
        blueLabel = new Label("Blue:");
        rgbValueLabel = new Label("RGB(0, 0, 0)");

        // Color display panel
        colorPreview = new Panel();
        colorPreview.setBackground(Color.black);

        // Layout
        setLayout(null);
        setBackground(new Color(245, 245, 245)); // light gray background

        // Positioning
        colorPreview.setBounds(50, 50, 300, 100);
        redLabel.setBounds(50, 170, 50, 20);
        red.setBounds(100, 170, 250, 20);
        greenLabel.setBounds(50, 200, 50, 20);
        green.setBounds(100, 200, 250, 20);
        blueLabel.setBounds(50, 230, 50, 20);
        blue.setBounds(100, 230, 250, 20);
        rgbValueLabel.setBounds(50, 260, 300, 30);

        // Add components
        add(colorPreview);
        add(redLabel);
        add(red);
        add(greenLabel);
        add(green);
        add(blueLabel);
        add(blue);
        add(rgbValueLabel);

        // Event listeners
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        // Frame settings
        setSize(400, 350);
        setVisible(true);
        setResizable(false);

        // Close window on 'X'
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
        rgbValueLabel.setText("RGB(" + r + ", " + g + ", " + b + ")");
    }

    public static void main(String[] args) {
        new _12_Scrollbar();
    }
}
