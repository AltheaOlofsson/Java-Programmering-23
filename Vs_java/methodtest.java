import java.util.Scanner;
public class methodstest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Hello, visitor.");



    }
    static void passWord(){
        System.out.println("Please enter your Password: ");
        Scanner s = new Scanner(System.in);
        String pass = s.nextLine();
        if (pass.equals("Asta")){
            System.out.println("Correct. Welcome.");
            return true;
        }

    }


}
