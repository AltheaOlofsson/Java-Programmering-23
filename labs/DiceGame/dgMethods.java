package labs.DiceGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dgMethods {

    // int guessedNumber;

    public static void playGame(Player player1, int rounds, int guessedNumber,int sides,Scanner input){

              for (int i = 0; i < rounds; i++) {

            while(true) {

                try {
                System.out.println("Guess which number you'll get on roll " + (i+1) + "? (Between 1 and " + sides + ").");
                player1.setGuessedNumber(input.nextInt());
                if (player1.getGuessedNumber() < 1 || player1.getGuessedNumber() > sides) {
                    System.out.println("Number out of bounds. Plese enter a valid number (Between 1 and " + sides + ").");
                    continue;
                } 
                break;
                } catch (InputMismatchException e){
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                }
            }
            player1.rollDice();

            if (player1.getGuessedNumber() == player1.getDieValue()) {
                System.out.println("Correct. You get one point.");
                player1.increseScore();
            } else {
                System.out.println("Miss. Too bad.");
            }
        }

    }
    // public void setGuessedNumber(int guessedNumber){
    //     this.guessedNumber = guessedNumber;
    // }

    // public int getGuessedNumber(){
    //     return guessedNumber;
    // }
    
}
