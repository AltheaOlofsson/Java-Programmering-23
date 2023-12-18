package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorExerciseTest {

    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }


    @Test
    public void onePlusOneEqualsTwo(){
        //setup
        int a = 5;
        int b = 8;

        //CUT
        int actual = calculator.add(a,b);

        //Assertions
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fivePlusThreeDividedByTwoIsFour(){
        //Setup
        int a = 7;
        int b = 2;

        //CUT
        double actual = calculator.divide(a, b);

        //Assertion
        double expected = 3.5;
        Assertions.assertEquals(expected, actual);    
    }

    @Test
    public void returnTrueIfIntIsEven(){
        //setUp
        int a = 8;
        //CUT
        boolean actual = calculator.isEven(a);

        //Assertions
        Assertions.assertTrue(actual);

    }

    @Test
    public void returnLengthOfTwoStrings(){
        //SetUp
        String present = "Valkyries of ";
        String from = "Hyperion.";

        //CUT
        int actual = calculator.stringLength(present, from);
        int expected = 20;

        //Assertions
        Assertions.assertEquals(expected, actual);

    }



    
}
