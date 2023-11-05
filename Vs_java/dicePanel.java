import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class dicePanel {
    public static void main(String[] args){

        JFrame frame = new JFrame("Dice roller");
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll");
        Random dice = new Random();
        JLabel text = new JLabel();
        //JTextField log = new JTextField();

        button.setBounds(100,100,100,40);
        frame.setSize(250,100);

        text.setVisible(false);
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