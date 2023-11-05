package exercises.solutionslocal;

public class E3Exercise3 {
    public static void main(String[] args) {

Car Volvo = new Car("Volvo","XC70",2017,"Red");
Car Toyota = new Car("Toyota","Aygo");

System.out.println(Volvo.color);
System.out.println(Toyota.model);
System.out.println(Toyota.year);
        
    }
    
}
class Car {
    String make = "123";
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    Car(String make, String model){
        this(make,model,0,"Unknown");
    }
    Car(String model, int year){
        this("Unknown",model,year,"Unknown");
    }
    Car(String model, int year, String color){
       this("Unknown",model,year,color);
    }
    Car(String make,String model,int year){
        this(make,model,year,"Unknown");
    }

}
