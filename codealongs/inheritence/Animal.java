package codealongs.inheritence;

public class Animal {
    public int age;
    protected double weight;
    private double lenght;

    public String name;

    public Animal(int age, double weight, double lenght){
        this.age = age;
        this.weight = weight;
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
}
