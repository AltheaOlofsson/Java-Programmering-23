package se.iths;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    //1+1=2
    @Test
    public void onePlusOneEqualsTwo(){
        //setup
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;

        //cut
        int actual = calculator.add(a, b);

        //assertion
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    //1+3=5
    @Test
    public void onePlusThreeNotEqualsToFive(){
        //setup
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 3;

        //cut
        int actual = calculator.add(a, b);

        //assertion
        int expected = 5;
        Assertions.assertNotEquals(expected, actual);

    }


    
}
