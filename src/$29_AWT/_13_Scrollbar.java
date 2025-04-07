package $29_AWT;

import java.awt.*;
import java.awt.event.*;

public class _13_Scrollbar extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    Label redLabel, greenLabel, blueLabel, rgbLabel;
    Panel colorPreview;

    public _13_Scrollbar() {
        super("AWT Color Mixer");

        // Frame background and layout
        setBackground(new Color(245, 245, 245));
        setLayout(null);

        // Color preview panel
        colorPreview = new Panel();
        colorPreview.setBackground(Color.black);
        colorPreview.setBounds(40, 50, 320, 100);
        add(colorPreview);

        // RGB value label (just below panel)
        rgbLabel = new Label("RGB(0, 0, 0)", Label.CENTER);
        rgbLabel.setBounds(40, 155, 320, 25);
        rgbLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(rgbLabel);

        // Scrollbar labels
        redLabel = new Label("Red");
        greenLabel = new Label("Green");
        blueLabel = new Label("Blue");

        redLabel.setBounds(40, 190, 50, 20);
        greenLabel.setBounds(40, 220, 50, 20);
        blueLabel.setBounds(40, 250, 50, 20);

        // Scrollbars
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);

        red.setBounds(100, 190, 260, 15);
        green.setBounds(100, 220, 260, 15);
        blue.setBounds(100, 250, 260, 15);

        // Add components
        add(redLabel);
        add(greenLabel);
        add(blueLabel);
        add(red);
        add(green);
        add(blue);

        // Listeners
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        // Frame settings
        setSize(400, 320);
        setResizable(false);
        setVisible(true);

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
        new _13_Scrollbar();
    }
}
