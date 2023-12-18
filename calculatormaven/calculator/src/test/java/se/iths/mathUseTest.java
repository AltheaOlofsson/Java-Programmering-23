package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class mathUseTest {

    @Test
    public void rounded (){
        //setup
        mathUse math = new mathUse();
        double a = 2.5;

        //CUT
        int actual = math.roundWithMath(a);
        //Assertion
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRandomofADouble(){
        //setup
        Random random = new Random();
        
        //CUT
        double actual = random.nextDouble();

        //Assertion
        boolean expected = (actual>=0)&&(actual<=1);

        assertTrue(expected);

    }



    
}
