import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        String message = "Hello Traveler!";

        JFrame frame = new JFrame("Hello Window!");
        frame.setSize(350, 250);

        JLabel label = new JLabel(message, JLabel.CENTER);


        frame.add(label);

        frame.setVisible(true);
        

    }
}
