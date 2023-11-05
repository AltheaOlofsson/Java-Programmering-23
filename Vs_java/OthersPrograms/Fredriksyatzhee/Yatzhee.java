package Vs_java.OthersPrograms.fredriksyatzhee;

import java.util.ArrayList;
import java.util.Scanner;

public class Yatzhee {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Player> playerList = new ArrayList<Player>();

        int amountPlayers = 1;

        for (int p = 0; p < amountPlayers; p++) // 'p' for Players
        { 
            System.out.print("What is your name? ");
            String name = userInput.nextLine();
            Player p1 = new Player(name);
            playerList.add(p1);
            for (int d = 0; d < 6; d++) {
                p1.addDie(6);
            }
        }
        
        for (Player p : playerList) // 'p' for Players
        {
            
            //This part doesn't work
            for (int i = 0; i < 3; i++)
            {
                p.rollDice();
                p.resetKeep();
                System.out.println("Player {" + p.getName() + "}, Attempt nr" + (i+1) + " result: ");
                if (i < 2)
                {
                    p.printDieValueList();
                    p.decideDiceKeep(userInput); 
                    p.printDieValueList();
                }
            }

            System.out.println("|FINAL RESULT|");
            p.printDieValueList();
        }
    }
}
