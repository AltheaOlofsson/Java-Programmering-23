import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class advancedMultiline {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Window!");
        frame.setSize(350, 250);

        // Create an array of strings for multiline text
        String[] multilineText = {
            "Hello Traveler",
            "Welcome to a multiline message!",
            "You can add as many lines as you want."
        };

        frame.add(new HelloComponent(multilineText));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class HelloComponent extends JComponent implements MouseMotionListener {
    private String[] multilineText;
    private int messageX = 125, messageY = 95;

    public HelloComponent(String[] multilineText) {
        this.multilineText = multilineText;
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw each line of text on a separate line
        int yOffset = messageY;
        for (String line : multilineText) {
            g.drawString(line, messageX, yOffset);
            yOffset += 20; // Adjust the vertical spacing between lines
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
