package se.iths;

public class mathUse {
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
    public int roundWithMath(double a){
        int roundedNumber = (int) Math.round(a);
        return roundedNumber;
    }
    
}
