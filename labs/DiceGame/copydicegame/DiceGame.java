package labs.DiceGame;
// import java.util.InputMismatchException;
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sides;
        int guessedNumber=0;
        boolean replay = true;

        System.out.println("Welcome, player. What is your name?");
        String name = input.nextLine();
        Player player1 = new Player(name);

        System.out.println("Nice to meet you, " + player1.getName() +". Do you want to hear the rules of this game? Type yes to see the rules.");

        String rules = input.nextLine().toLowerCase();
        if(rules.equals("yes")) {
            System.out.println("First you will choose how many rounds you want to play and how many sides you want on your die.");
            System.out.println("Then proceed to guess which number the die will roll every round. If you guessed correctly you will get a point. Are you ready to begin?");
            String begin = input.nextLine().toLowerCase();
            if (begin.equals("yes")) {
                System.out.println("Great. Let's begin.");
            } else {
                System.out.println("Thats too bad. Please come back when you want to play.");
                System.exit(0);
            }

        } else {
            System.out.println("Very well. Let's begin.");
        }
    

        while (replay){

        System.out.println("How many rounds would you like to play?");
        int rounds = input.nextInt();

        System.out.println("And how many sides on the die do you want?");
        sides = input.nextInt();
        player1.addDie(sides);

        System.out.println("Fantastic! Good luck with your guesses.");

        dgMethods.playGame(player1, rounds, guessedNumber, sides, input);

        // for (int i = 0; i < rounds; i++) {

        //     while(true) {

        //         try {
        //         System.out.println("Guess which number you'll get on roll " + (i+1) + "? (Between 1 and " + sides + ").");
        //         guessedNumber = input.nextInt();
        //         if (guessedNumber < 1 || guessedNumber > sides) {
        //             System.out.println("Number out of bounds. Plese enter a valid number (Between 1 and " + sides + ").");
        //             continue;
        //         } 
        //         break;
        //         } catch (InputMismatchException e){
        //             System.out.println("Invalid input. Please enter a number.");
        //             input.next();
        //         }
        //     }
        //     player1.rollDice();

        //     if (guessedNumber == player1.getDieValue()) {
        //         System.out.println("Correct. You get one point.");
        //         player1.increseScore();
        //     } else {
        //         System.out.println("Miss. Too bad.");
        //     }
        // }
            System.out.println("");
            System.out.println("Calculating results...");
            System.out.println("");
            System.out.println("");
            System.out.println("You scored " + player1.getPoint() + " out of " + rounds + " rounds.");
            if (player1.getPoint() == rounds) {
                System.out.println("100%! Congratulations! You're a PRO!");
            } else if (player1.getPoint() > (rounds/2)) {
                System.out.println("You got over half correct. Well done.");
            } else {
                System.out.println("Better luck next time.");
            }
            input.nextLine();
            System.out.println("");
            System.out.println("Do you want to play again?");
            String playagain = input.next();
            if(playagain.equalsIgnoreCase("yes")){
                player1.resetPoint();
            }else {
                replay = false;
            }
        }
    
       
        System.out.println("Please come back anytime. Goodbye for now.");
        System.out.println("Closing Game...");
        input.close();


    }
    
}
