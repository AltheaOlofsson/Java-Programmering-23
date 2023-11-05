package labs.DiceGame.DiceGame_Althea;

import java.util.Random;

public class Die {
    private int sides;
    private int value;
    Random dieroll = new Random();

    Die(int sides){
        this.sides = sides;
        this.value = 0;
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
