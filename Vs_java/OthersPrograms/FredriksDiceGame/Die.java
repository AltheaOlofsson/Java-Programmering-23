package Vs_java.OthersPrograms.FredriksDiceGame;

import java.util.Random;

public class Die {
    private int sides;
    private int value;
    private Random dice = new Random();

    Die(int sides) {
        this.sides = sides;
        this.value = 0;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = dice.nextInt(sides) + 1;
    }
}