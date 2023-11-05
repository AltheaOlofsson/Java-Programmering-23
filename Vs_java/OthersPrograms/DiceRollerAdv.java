import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceRollerAdv 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Dice roller");
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll D6");
        Random dice = new Random();
        JLabel text = new JLabel();
        JTextField log = new JTextField("");
        
        button.setBounds(100,100,100, 40);
        frame.setSize(400,400);
        //log.setSize(400, 1000);
        
        text.setVisible(false);
        frame.add(panel);
        panel.add(button);
        panel.add(text);
        panel.add(log);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if(e.getSource() == button)
                {
                    int diceD6 = dice.nextInt(6) + 1;
                    //System.out.println("You pressed it, good job.");
                    text.setVisible(true);
                    text.setText("You rolled: " + diceD6);
                    log.setText("From a D6 you rolled: " + diceD6);
                }
            }
        });
    }
}
