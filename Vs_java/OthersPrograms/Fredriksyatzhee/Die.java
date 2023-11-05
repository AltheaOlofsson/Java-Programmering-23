package Vs_java.OthersPrograms.fredriksyatzhee;

import java.util.Random;

class Die {
    private int sides;
    private int value;
    private boolean keep = false;
    private Random dice = new Random();

    Die(int sides) {
        this.sides = sides;
        this.value = 0;
    }

    public void setKeep(boolean input)
    {
        keep = input;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        if (!keep)
        {
            value = dice.nextInt(sides) + 1;
        }
    }

    public String toString()
    {
        String result;
        result = "" + value;
        if (keep)
        {
            result += "*";
        }
        return result;
    }
}