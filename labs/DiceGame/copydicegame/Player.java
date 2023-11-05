package labs.DiceGame;

import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    private Die playerDie;
    // private ArrayList<Die> playerDie;
    public int guessedNumber;
  

    Player(String name){
        this.name = name;
        // this.playerDie = new ArrayList<Die>();
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
        // playerDie.add(new Die(sides));
         playerDie = new Die(sides);
    }

    public void rollDice(){

        playerDie.roll();
        // for (Die d : playerDie) {
        //     d.roll();
        //     System.out.println(d.getValue());
        // }
    }

    public int getDieValue(){

        return playerDie.getValue();
        
        // int value = 0;
        // for (Die v : playerDie){
        //     value += v.getValue();
        // }
        // return playerDie.get(value).getValue();
    }

    public void increseScore(){
        this.points += 1;    
    }
    // public void increaseScore(int point){
    //     this.points += point;
    // }
    public void setGuessedNumber(int guessedNumber){
        this.guessedNumber = guessedNumber;
    }

    public int getGuessedNumber(){
        return guessedNumber;
    }

    public int resetPoint(){
        points = 0;
        return points;
    }

    
}
