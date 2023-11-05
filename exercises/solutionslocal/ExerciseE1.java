package exercises.solutionslocal;

public class ExerciseE1 {
    public static void main(String[] args) {
        
        int myAge = 29;

        String myFirstName = "Althea";

        System.out.println("My first name is " + myFirstName + " and I am "+ myAge + " years old.");

        boolean boo = true;
        boolean compare = myAge <30;

        int x = 256; //x = y is allowed, y does fit in x.(an int)

        byte y = 8; // y = x is not allowed, x does not fit in y(a byte)

        // a, is allowed.
        // b, is allowed.
        // c, is not allowed. "blue" is not an int.
        // d, is not allowed. % is not acceptable in variable name.
        // e, is not allowed. the zero is an int.
        // f, is allowed.
        // g, is not allowed. the variable is not an int.
        // h, this is allowed.
        // i, is not allowed, 1024 is too big for a byte.
        // j, is allowed. an unicode is a char.


        // a, calypso is a variable of the type ship.
        // b, calypso is of the type ship and the numbers on the right is the location of the reference.
        // c, I guess the output would be the reference of calypso.
        // d, the variable saoGabriel get the new value of calypso, whick means the same reference as calypso had.

        int a = 8, b = 24;
            //no you are declaring a short inside an int which is not allowed.
            // int a = 8; short = 24; is allowed since a semicolon follows each declaration.




/*a,6 + 11; 17
b ,8 + (14 - 11); 11
c, 9 * 6 + 2; 56
d, 9 * (6 + 4); 90
e, 8 < 400; true
f ,12 == 7 + 4; false 
g ,9*9 + 4 > 80; true
h,"costeau" != "daGama"; true
i, 'f' < 'a'; false
j, (4 + 3 == 7) && (4 - 3 == 1); true båda är true
k, (4 + 3 == 7) && ('j' > 'p'); false den ena är fel.
l, (800 - 200 <= 600) || (5 * 8 == 35); true den ena stämmer
m, (4 * 4 == 16) ^ (6 - 2 == 4); båda är true men vet inte vad pilen betyder så den är false */
        


    }
    
}
