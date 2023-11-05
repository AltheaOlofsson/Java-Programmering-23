import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class redDie {
    public static void main(String[] args) {
        
                Random die = new Random();
                String welcome = "Welcome. Please roll the dice.";
        
                JFrame frame = new JFrame("Dice roller");
                frame.setSize(600,600);
                frame.setVisible(true);
        
                JLabel label = new JLabel(welcome);
                label.setBounds(200,50,300,50);
                frame.add(label);
                label.setVisible(true);

                JLabel result = new JLabel();
                result.setBounds(180, 100, 50, 50);
                frame.add(result);
        
                JButton button1 = new JButton("Red Die");
                button1.setBounds(50,100,90,50);
                frame.add(button1);
                button1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == button1) {
                            int die1Random = die.nextInt(6) + 1;
                            System.out.println(die1Random);
                            result.setText(String.valueOf(die1Random));
                            result.setVisible(true);
                        }
                    }
                });

                JLabel result2 = new JLabel();
                result2.setBounds(180,150,50,50);
                frame.add(result2);

                JButton button2 = new JButton("Blue Die");
                button2.setBounds(50, 150, 90, 50);
                frame.setLayout(null);
                button2.setVisible(true);
                button2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == button2) {
                            int die2Random = die.nextInt(6) + 1;
                            System.out.println(die2Random);
                            result2.setText(String.valueOf(die2Random));
                            result2.setVisible(true);
                            result2.setText(die2Random);
                        }
                    }
                });

                 JLabel result3 = new JLabel();
                result3.setBounds(180,200,50,50);
                frame.add(result3);

                JButton button3 = new JButton("Blue Die");
                button3.setBounds(50, 200, 90, 50);
                frame.setLayout(null);
                button3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == button3) {
                            int die3Random = die.nextInt(6) + 1;
                            System.out.println(die3Random);
                            result3.setText(String.valueOf(die3Random));
                            result3.setVisible(false);
                            result3.setText(die3Random);
                        }
                    }
                });


    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
