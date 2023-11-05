package labs.DiceGame.Yatzy;

import java.util.Random;

public class Die {
    private int sides;
    private int value;
    Random dieroll = new Random();
    private boolean save = false;

    public boolean getSave() {
        return save;
    }
    public void setSave(boolean save) {
        this.save = save;
    }
    Die(int sides){
        this.sides = sides;
        value = 0;
    }
    public int getSides(){
        return sides;
    }
    public int getValue(){
        return value;
    }

    public void roll(){
        value = dieroll.nextInt(sides) + 1;
    }
    


         
}
