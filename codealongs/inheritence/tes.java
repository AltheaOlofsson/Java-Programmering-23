package codealongs.inheritence;

import codealongs.polymorphism.Robot;

public class tes {
    public static void main(String[] args) {
        Animal a = new Animal(12, 65.2 , 131.8);
        System.out.println(a.getLenght());
        Walrus w = new Walrus(16, 312, 125);
        System.out.println(w.getLenght());
    

        Robot r = new Robot();

        Parrot p = new Parrot(3,26,38,"polly");
        walrusChecker(p);

        introduce(p);
        introduce(r);


    }
    public static void walrusChecker(Animal a) {
        if (a instanceof Walrus) {
            System.out.println("this is a walrus");
        }    else { System.out.println(" this is not an walrus, it is a " + a.getClass().getSimpleName());}
        
    }
    public static void introduce(Talking t) {
        t.talk("Hello!");

    }


    
}
