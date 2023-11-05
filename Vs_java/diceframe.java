import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class diceframe {
    public static void main(String[] args){
        Random die = new Random();
        String welcome = "Welcome. Please roll the dice.";

        JFrame frame = new JFrame("Dice roller");
        frame.setSize(400,300);

        JLabel label = new JLabel(welcome);
        label.setBounds(200,200, 200,50);
        frame.add(label);
        label.setVisible(true);

        JButton button1 = new JButton("Red Die");
        button1.setBounds(50,50,90,50);
        frame.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerfomed(ActionEvent e) {
                if (e.getSource() == button1) {
                    int die1Random = die.nextInt(6) + 1;
                    System.out.println(die1Random);
                }
            }
        });
        Random dice = new Random();
        JLabel text = new JLabel();
        //JTextField log = new JTextField();

        button.setBounds(100,100,100,40);


        text.setVisible(true);
        frame.add(panel);
        panel.add(button);
        panel.add(text);
        //panel.add(log);
        frame.setVisible(true);

        button.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                if(e.getSource() == button){
                    
                    int dice1 = dice.nextInt(6) + 1;
                    text.setVisible(true);
                    text.setText("You rolled: " + dice1);
                    //log.setText("Log text..");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}