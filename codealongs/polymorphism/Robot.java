package codealongs.polymorphism;

import codealongs.inheritence.Talking;

public class Robot implements Talking {
    public String name = "mr.Robot";

    public void talk(String message){
        System.out.println("Message recieved. Generating response...");
        if (message.length() < 25){
            System.out.println("hello");
        } else { System.out.println(" message too long");}
    }
}
