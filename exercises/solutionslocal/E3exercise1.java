package exercises.solutionslocal;

public class E3exercise1 {
    public static void main(String[] args){ 

    Bookclass harryp = new Bookclass();
    System.out.println(harryp.title);
    System.out.println(harryp.author);
    System.out.println(harryp.year);

    }
}
    class Bookclass {
        String title;
        String author;
        int year;

        Bookclass(){
            title = "HarryP";
            author = "JKRowling";
            year = 1990;
        }



    }