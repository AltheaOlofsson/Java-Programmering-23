import java.util.Random;
public class randomdie {
    public static void main(String[] args) {
        Random die1 = new Random();

        int result = die1.nextInt(6) + 1;
        System.out.println(result);
    }
    
}
