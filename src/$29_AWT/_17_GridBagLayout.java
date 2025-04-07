package $29_AWT;

import java.awt.*;

public class _17_GridBagLayout extends Frame {
    Button b1, b2, b3, b4, b5, b6, b7;

    public _17_GridBagLayout(){
        super("GridBagLayout");

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(b1, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(b2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(b3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(b4, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(b5, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        add(b6, gbc);

        setSize(300, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new _17_GridBagLayout();
    }
}
