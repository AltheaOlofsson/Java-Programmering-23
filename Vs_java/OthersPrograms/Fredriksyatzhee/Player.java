package Vs_java.OthersPrograms.fredriksyatzhee;

import java.util.ArrayList;
import java.util.Scanner;

class Player {
    private String name;
    private int score;
    private ArrayList<Die> myDice;

    Player(String name) {
        this.name = name;
        this.score = 0;
        this.myDice = new ArrayList<Die>();
    }

    public String getName() {
        return name;
    }

    public void rollDice() {
        for (Die d : myDice) { //'d' for dice
            d.roll();
        }
    }

    public void decideDiceKeep(Scanner keepInput)
    {
        for (Die d : myDice) 
        {
            System.out.println("["+d.getValue()+"] - Do you want to keep this die? (y/n)?");
            if (keepInput.nextLine().compareToIgnoreCase("y") == 0)
            {
                d.setKeep(true);
            }
        }
    }

    public int getDieValue() {
        int totalValue = 0;
        for (Die v : myDice) { //'v' for value
            totalValue += v.getValue();
        }
        return totalValue;
    }

    public int[] getDieValueList() {
        int[] rollList = new int[myDice.size()];
        int i = 0;
        for (Die d : myDice)
        {
            rollList[i] = d.getValue();
            i++;
        }
        return rollList;
    }

    public void printDieValueList()
    {
        System.out.println(dieValueListToString());
    }

    public String dieValueListToString()
    {
        String stringResult = "";
        for (Die d : myDice)
        {
            stringResult += d.toString() + ", ";
        }
        return stringResult;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore()
    {
        this.score += 1;
    }

    public void increaseScore(int score) {
        this.score += score;
    }

    public void addDie(int sides) {
        myDice.add(new Die(sides));
    }

    public void resetKeep()
    {
        for (Die d : myDice)
        {
            d.setKeep(false);
        }
    }
}