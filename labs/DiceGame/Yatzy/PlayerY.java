package labs.DiceGame.Yatzy;
import java.util.Scanner;
import java.util.ArrayList;

public class PlayerY {
    private String name;
    private int points;
    private ArrayList<Die> playerDie;
    private ArrayList<PlayerY> players;
    Scanner in = new Scanner(System.in);
    private static ArrayList<Die> checkList = new ArrayList<Die>();
    
  

    PlayerY(String name){
        this.name = name;
        this.points = 0;
        this.playerDie = new ArrayList<Die>();
        this.players = new ArrayList<PlayerY>();
    }
    public String getName(){
        return name;
    }
    public int getPoint(){
        return points;
    }
    public int setPoint(){
        return points;
    }
    public ArrayList<Die> getPlayerDie(){
        return playerDie;
    }
    
    public void addDie(int sides){
        playerDie.add(new Die(sides));
    }

    public void rollDice(){
        
        for (Die d : playerDie) {
            if (d.getSave() == false){
                d.roll();
            }
            // System.out.println(name + "'s Die value: " + d.getValue());
        }
    }
    // public void rollDice() {
    //     for (int i = 0; i < playerDie.size(); i++) {
    //         Die dice = playerDie.get(i);
    //         dice.roll();
    //         System.out.println(name + "'s Die " + (i + 1) + " value: " + dice.getValue());
    //     }
    // }

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
    // public void increaseScore(int point){
    //     this.points += point;
    // }
    public void addPlayer(String name) {
        players.add(new PlayerY(name));
 
    }
    public void printDieValue(){
        for (Die d : playerDie){
            System.out.println("You rolled: " + d.getValue());
        }
    }
    public void saveDie(int value){ 
        for (Die d : playerDie){
            if (d.getValue() == value){
                d.setSave(true);
            } else {
                d.setSave(false);
            }
        }

    }
    public ArrayList<Die> getPlayerDieList(){
        return checkList;
    }

    public static void resetSaved(){
        for(Die d : playerDie){
            d.setSave(false);
        }
    
    }



    
}
