package labs.DiceGame;

import java.util.Random;

class DiceClass {
    private int sides;
    private int value;
    private Random die = new Random();   
    
    DiceClass(int sides){
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
        value = die.nextInt(sides);
    }
}

