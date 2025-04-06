import java.awt.*;
import java.awt.event.*;

public class _04_TypingSpeedTest extends Frame implements KeyListener, ActionListener {
    Label sentenceLabel, wpmLabel, accuracyLabel, timerLabel;
    TextField typingField;
    Button resetBtn;

    String sentence = "The quick brown fox jumps over the lazy dog";
    long startTime = 0;
    boolean started = false;
    int timeLeft = 60; // seconds
    MyTimer timer;

    public _04_TypingSpeedTest() {
        setTitle("AWT Typing Speed Test");
        setSize(600, 300);
        setLayout(null);
        setBackground(new Color(240, 248, 255));

        // Sentence to type
        sentenceLabel = new Label("Type this: " + sentence);
        sentenceLabel.setBounds(50, 50, 500, 30);
        add(sentenceLabel);

        // Typing field
        typingField = new TextField();
        typingField.setBounds(50, 90, 500, 30);
        typingField.addKeyListener(this);
        add(typingField);

        // Labels
        wpmLabel = new Label("WPM: 0");
        wpmLabel.setBounds(50, 140, 150, 30);
        add(wpmLabel);

        accuracyLabel = new Label("Accuracy: 0%");
        accuracyLabel.setBounds(220, 140, 150, 30);
        add(accuracyLabel);

        timerLabel = new Label("Time left: 60s");
        timerLabel.setBounds(400, 140, 150, 30);
        add(timerLabel);

        // Reset Button
        resetBtn = new Button("Reset");
        resetBtn.setBounds(250, 200, 100, 30);
        resetBtn.addActionListener(this);
        add(resetBtn);

        // Close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                if (timer != null) timer.stop();
            }
        });

        setVisible(true);
    }

    void startTimer() {
        timer = new MyTimer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timerLabel.setText("Time left: " + timeLeft + "s");

                if (timeLeft <= 0) {
                    timer.stop();
                    typingField.setEnabled(false);
                    calculateResults();
                }
            }
        });
        timer.start();
    }

    void calculateResults() {
        String typed = typingField.getText().trim();
        String[] typedWords = typed.split("\\s+");
        String[] targetWords = sentence.split("\\s+");

        int correctWords = 0;
        for (int i = 0; i < Math.min(typedWords.length, targetWords.length); i++) {
            if (typedWords[i].equals(targetWords[i])) {
                correctWords++;
            }
        }

        double timeTaken = (System.currentTimeMillis() - startTime) / 60000.0; // in minutes
        int wpm = (int) (typedWords.length / timeTaken);
        int accuracy = typedWords.length == 0 ? 0 : (int) (((double) correctWords / typedWords.length) * 100);

        wpmLabel.setText("WPM: " + wpm);
        accuracyLabel.setText("Accuracy: " + accuracy + "%");
    }

    void resetTest() {
        typingField.setEnabled(true);
        typingField.setText("");
        wpmLabel.setText("WPM: 0");
        accuracyLabel.setText("Accuracy: 0%");
        timerLabel.setText("Time left: 60s");
        timeLeft = 60;
        started = false;
        if (timer != null) timer.stop();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (!started) {
            startTime = System.currentTimeMillis();
            started = true;
            startTimer();
        }

        String currentTyped = typingField.getText() + e.getKeyChar();
        if (currentTyped.trim().equals(sentence)) {
            typingField.setEnabled(false);
            if (timer != null) timer.stop();
            calculateResults();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetBtn) {
            resetTest();
        }
    }

    @Override public void keyPressed(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    // Custom AWT-friendly timer
    class MyTimer {
        private java.util.Timer t;
        private boolean running = false;

        public MyTimer(int delay, ActionListener listener) {
            t = new java.util.Timer();
            t.scheduleAtFixedRate(new java.util.TimerTask() {
                public void run() {
                    if (running) listener.actionPerformed(null);
                }
            }, delay, delay);
            running = true;
        }

        public void stop() {
            t.cancel();
            running = false;
        }

        public void start() {
            running = true;
        }
    }

    public static void main(String[] args) {
        new _04_TypingSpeedTest();
    }
}
