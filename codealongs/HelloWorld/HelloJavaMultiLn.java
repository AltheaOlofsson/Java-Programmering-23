import javax.swing.*;
import java.awt.GridLayout;

public class HelloJavaMultiLn {
    public static void main(String[] args) {
        String message = "Hello";

        JFrame frame = new JFrame("Hello Window!");
        frame.setSize(350, 250);

        JPanel panel = new JPanel(new GridLayout(5,1));

        JLabel label = new JLabel(message, JLabel.CENTER);


        frame.add(panel);

        panel.add(label);

        frame.setVisible(true);


    }
}
