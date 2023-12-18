package se.iths;

import org.junit.jupiter.params.*;

import org.junit.jupiter.api.*;

public class TestPalindrome {

    





    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());  
    }
    
}
