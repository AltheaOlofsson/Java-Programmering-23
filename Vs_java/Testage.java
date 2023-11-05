import java.util.Scanner;
public class Testage {
    public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
    
        System.out.println("How old are you?");
    
        
        int age = sc.nextInt();

        System.out.println("How old is your mother?");

        int mage = sc.nextInt();

        System.out.println("This is your combined age, "+(age+mage));

    }
    
}
