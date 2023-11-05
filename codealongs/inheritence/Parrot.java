package codealongs.inheritence;

public class Parrot extends Animal implements Talking {
    public Parrot(int age, double weight,double length, String name){
        super(age, weight, length);
        this.name = name;
    }
    public Parrot(){
        super(8,23,75);
    }

    public void fly(double time){

    }
    
    public void talk(String message){
        System.out.println(name + "wants to say " + message);
    }
}
