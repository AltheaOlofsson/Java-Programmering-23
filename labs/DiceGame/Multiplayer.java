package labs.DiceGame;
// import java.util.Scanner;
public class Multiplayer {
    private String name;
    private int point;
    private Die dice;
  

    Multiplayer(String name){
        this.name = name;
        this.point = 0;
    }
    public String getName(){
        return name;
    }
    public int getPoint(){
        return point;
    }
    public int setPoint(){
        return point;
    }
    public void addDie(int sides){
        Die die1 = new Die(sides);
        // dice.add(new Die(sides));
    }
    public void rollDice(){
        dice.roll();
    }


    public int getDieValue(){
        Die val = dice;
        int value = 0;
        value += val.getValue();
        return value;
    }
    public void increseScore(){
        this.point += 1;    
    }
    public void increaseScore(int point){
        this.point += point;
    }


    
}
