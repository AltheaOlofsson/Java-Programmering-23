import javax.swing.*;

public class HelloJavaMultiLnhtml {
    public static void main(String[] args) {
        String message = "<html>Hello Traveler!<BR>May you have an eventful journey!<html>";

        JFrame frame = new JFrame("Hello Window!");
        frame.setSize(350, 250);

        JLabel label = new JLabel(message, JLabel.LEFT);

        frame.add(label);

        frame.setVisible(true);


    }
}
