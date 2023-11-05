package labs.DiceGame;

import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    private ArrayList<Die> playerDie;
    public int guessedNumber;
  

    Player(String name){
        this.name = name;
        this.playerDie = new ArrayList<Die>();
    }
    public String getName(){
        return name;
    }
    public int getPoint(){
        return points;
    }
    public int setPoint(){
        this.points = 0;
        return points;
    }
    
    public void addDie(int sides){
        playerDie.add(new Die(sides));
    }

    public void rollDice(){

        for (Die d : playerDie) {
            d.roll();
        }
    }

    public int getDieValue(){
        
        int value = 0;
        for (Die v : playerDie){
            value += v.getValue();
        }
        return value;
    }

    public void increseScore(){
        this.points += 1;    
    }

    public int resetPoint(){
        points = 0;
        return points;
    }
    public ArrayList<Die> getPlayerDice(){
        return playerDie;
    }

    
}
