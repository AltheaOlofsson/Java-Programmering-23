import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testpanel {
    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Hello Window!");
        frame.setSize(350, 250);
        JTextArea textArea = new JTextArea("Hello Traveler,\nMay your Journey\nTake you starward.");
        textArea.setEditable(true);
        frame.add(new HelloComponent(textArea));


        frame.add(textArea);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

    
class HelloComponent extends JComponent
    implements MouseMotionListener {
        private JTextArea textArea;
        private String message = "";

        public void HelloComponent(JTextArea textArea) {
            this.textArea = textArea;
            this.message = textArea.getText();
            addMouseMotionListener(this);

        }

        int messageX = 125, messageY = 95;


        public void paintComponent(Graphics g){
            g.drawString(message, messageX, messageY);
        }
        
        public void mouseDragged(MouseEvent e) {
            messageX =e.getX();
            messageY = e.getY();
            repaint();
        }

        public void mouseMoved(MouseEvent e) { }
}

