import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.random.*;


public class HelloWorldcopy {
    public static void main(String[] args) {
        String text = "Roll any dice";

        JFrame frame = new JFrame("Diceroller");
        frame.setSize(600, 600);

        JLabel label = new JLabel(text);
        label.setBounds(200, 200, 200, 50);
        frame.add(label);
        label.setVisible(true);

        JButton button = new JButton("D20");
        button.setBounds(50, 50, 90, 50);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    int d20Random = (int)(Math.random() * 20 + 1);
                    if (d20Random == 1) {
                        System.out.println(d20Random);
                        label.setText("Oh no! Critical failure!");
                    } else if (d20Random == 20) {
                        System.out.println(d20Random);
                        label.setText("Nat 20!!");
                    } else {
                        System.out.println(d20Random);
                        label.setText("You rolled " + d20Random);
                    }
                }
            }
        });

        JButton buttonD8 = new JButton("D8");
        buttonD8.setBounds(50, 150, 90, 50);
        frame.setLayout(null);
        frame.add(buttonD8);
        buttonD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonD8) {
                    int d8Random = (int)(Math.random() * 8 + 1);
                    System.out.println(d8Random);
                    label.setVisible(true);
                    label.setText("You rolled " + d8Random);
                }
            }
        });

        JButton buttonD6 = new JButton("D6");
        buttonD6.setBounds(50, 250, 90, 50);
        frame.setLayout(null);
        frame.add(buttonD6);
        buttonD6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonD6) {
                    int d6Random = (int)(Math.random() * 6 + 1);
                    System.out.println(d6Random);
                    label.setVisible(true);
                    label.setText("You rolled " + d6Random);
                }
            }
        });

        JButton buttonD4 = new JButton("D4");
        buttonD4.setBounds(50, 350, 90, 50);
        frame.setLayout(null);
        frame.add(buttonD4);
        buttonD4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonD4) {
                    int d4Random = (int)(Math.random() * 4 + 1);
                    System.out.println(d4Random);
                    label.setVisible(true);
                    label.setText("You rolled " + d4Random);
                }
            }
        });

        
        frame.setVisible(true);
    }
}

