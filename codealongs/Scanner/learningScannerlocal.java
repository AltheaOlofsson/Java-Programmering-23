package codealongs.Scanner;

import java.util.Scanner;

public class learningScannerlocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number:");
        int myNumber = scanner.nextInt();

        System.out.println(myNumber);

        System.out.println("Input a number with a decimal point. (You can also input rest here): ");
        double floatNumber = scanner.nextDouble();

        System.out.println(floatNumber);

        String rest = scanner.nextLine();

        System.out.println("Please enter a message");
        String message = scanner.nextLine();

        System.out.println("Input number: " + myNumber);
        System.out.println("Your float number is " + floatNumber);
        System.out.println("The message is: " + message);

        System.out.println(rest);


        scanner.close();


        
        




    }
}