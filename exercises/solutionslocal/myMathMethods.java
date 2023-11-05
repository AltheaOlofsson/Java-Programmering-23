package exercises.solutionslocal;

public class myMathMethods {
    int value = 1;
    myMathMethods(int value){
        this.value = value;
    }
    public static void main(String[] args) {

        //myMathMethods fact = new myMathMethods(10);
        //System.out.println(fact.calculateFactorial(10));
        System.out.println(calculateFactorial(5));
        System.out.println(fibonacci(5));
    }

    static int calculateFactorial(int value){
        int fact=1;
        for(int i = 1; i <= value; i++)
            fact = fact*i;
        return fact;
    }

    static int fibonacci(int value){

        if(value<1){
        throw new IllegalArgumentException("Number must be positive.");
        }
        if (value == 1|| value == 2){
            value = value - 1;
        }

        int previous = 0;
        int current = 1;
        int fibonacci = 0;

        for(int i = 3; i <= value; i++){
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;
        }
        return fibonacci;
    }



}

