import java.awt.*;
import java.awt.event.*;

public class _03_TypingSpeedTracker extends Frame implements KeyListener {
    Label sentenceLabel, speedLabel, typedLabel;
    TextField typingField;
    long startTime = 0;
    boolean started = false;

    public _03_TypingSpeedTracker() {
        setTitle("AWT Typing Speed Tracker");
        setSize(500, 250);
        setLayout(null);
        setBackground(new Color(245, 245, 245));

        // Sentence to type
        sentenceLabel = new Label("Type this: The quick brown fox jumps over the lazy dog.");
        sentenceLabel.setBounds(50, 50, 400, 30);
        add(sentenceLabel);

        // Typing field
        typingField = new TextField();
        typingField.setBounds(50, 90, 400, 30);
        typingField.addKeyListener(this);
        add(typingField);

        // Typed label
        typedLabel = new Label("Characters typed: 0");
        typedLabel.setBounds(50, 130, 200, 30);
        add(typedLabel);

        // Speed label
        speedLabel = new Label("Typing Speed: 0 CPM");
        speedLabel.setBounds(260, 130, 200, 30);
        add(speedLabel);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (!started) {
            startTime = System.currentTimeMillis();
            started = true;
        }

        String typedText = typingField.getText() + e.getKeyChar();
        int length = typedText.length();

        long elapsedTime = System.currentTimeMillis() - startTime;
        double minutes = elapsedTime / 60000.0;

        int cpm = (int) (length / minutes);

        typedLabel.setText("Characters typed: " + length);
        speedLabel.setText("Typing Speed: " + cpm + " CPM");
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new _03_TypingSpeedTracker();
    }
}
