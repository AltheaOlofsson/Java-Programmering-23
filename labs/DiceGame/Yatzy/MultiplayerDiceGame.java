package labs.DiceGame.Yatzy;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplayerDiceGame {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<PlayerY> playerList = new ArrayList<PlayerY>();

    
    System.out.println("How many players want to play?");
    int amountPlayers = input.nextInt();
    input.nextLine();

    for ( int i = 0; i < amountPlayers; i++){
        System.out.println("What is name of Player " + (i+1) + "?");
        String name = input.nextLine();
        PlayerY player = new PlayerY(name);
        playerList.add(player);
        for (int j = 1; j <= 5; j++){
            player.addDie(6);
        }
    }    

    for(int p = 0; p < playerList.size(); p++){
        System.out.println("");
        System.out.println("");
        PlayerY playerdrawer = playerList.get(p);

        System.out.println("Player: " + playerList.get(p).getName() + ". Turn: 1");
        playerdrawer.rollDice();

        System.out.println("Here is the value of your dice:");
        playerdrawer.printDieValue();

        for(int r = 1; r <= 3; r++){
            System.out.println("Choose which value to save.");
            playerdrawer.saveDie(input.nextInt());    
        
            System.out.println("Player: " + playerList.get(p).getName() + ". Turn: " + (r+1));
            playerdrawer.rollDice();

            System.out.println("Here is the value of your dice:");
            playerdrawer.printDieValue();
        }

        if (checkYatzy(playerdrawer.getPlayerDieList())){
            System.out.println("Yatzee!!");
        }
        
    
    }

        

    }   static boolean checkYatzy(ArrayList<Die> dieList){
            for (Die e : dieList){
                if (e.getValue() != dieList.get(0).getValue()){
                    return false;
                } 
            } return true;
        }

        
}

  

    


