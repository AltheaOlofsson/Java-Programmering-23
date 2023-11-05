package exercises.solutionslocal;

public class Main {
    public static void main(String[] args) {
        CatHotel foo = new CatHotel();
        foo.Asta.name = "Asta";
        foo.Asta.age = 2;
        foo.Asta.weight = 5.6;

        System.out.println(foo.Asta.name+ " is " + foo.Asta.age + " years old and weigh " + foo.Asta.weight + " kilograms.");
        System.out.println(foo.Yuno.name + " is " + foo.Yuno.age + " years old and weigh " + foo.Yuno.weight + " kilograms.");

        Cat Bruce = new Cat("Bruce",17,3.1);
    
        Cat NewAsta = foo.Yuno;

        



    }
}
