package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void IsPositive_shouldReturnTrue_whenNumberBiggerZero(){
        //given
        int num = 3;
        boolean expected = true;
        //when
        boolean actual = Main.isPositive(num);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void isPostive_shouldReturnFalse_whenNumberIsNegative(){
        //given
        int num = -4;
        boolean expected = false;
        //when
        boolean actual = Main.isPositive(num);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void getFirstLetter_returnNull_whenStringEmpty(){
        assertNull(Main.getFirstLetter(""));
    }

    @Test
    void getFirstLetter_returnNotNull_whenStringNotEmpty(){
        String text = "Hello";
        String expected = "H";

        String actual = Main.getFirstLetter(text);

        assertNotNull(Main.getFirstLetter(text));
        assertEquals(expected, actual);
    }

    @Test
    void devideNum_returnIllegalArgumentException_WhenSecondIntIsZero(){
        assertThrows(IllegalArgumentException.class, ()->Main.devideNum(10,0));
    }

    @Test
    void devideNum_Return2_WhenCalledWith4DevidedBy2(){
        assertEquals(Main.devideNum(4,2), 2);
    }

    @Test
    void isPrime_returnTrue_whenNumberIsAPrime(){
        assertEquals(Main.isPrime(7), true);
        assertEquals(Main.isPrime(4), false);
        assertEquals(Main.isPrime(11), true);
        assertEquals(Main.isPrime(1), true);
    }

    // excerise 2

    @Test
    void sum_returns6_When2Plus4(){
        int a = 2;
        int b = 4;

        int expected = 6;
        int actual = Main.sum(2,4);
        assertEquals(expected, actual);
    }

    @Test
    void isEven_returnsTrue_whenEntered4(){
        int a = 4;
        boolean expected = true;

        boolean actual = Main.isEven(a);

        assertEquals(expected, actual);
    }

    @Test
    void reverseString_returnsavaJ_whenEnteredJava(){
        String text = "Java";
        String expected = "avaJ";
        String actual = Main.reverseString(text);
        assertEquals(expected, actual);
        assertEquals(Main.reverseString("Hallo"), "ollaH");
    }

    @Test
    void palindrome_returnsTrue_whenEnteredOtto(){
        String text = "Otto";
        boolean expected = true;
        boolean actual = Main.palindrome(text);
        assertEquals(expected, actual);
        assertEquals(false, Main.palindrome("Java"));
    }
    @Test
    void countVowels_return2_whenEnteredHallo(){
        String text = "Hallo";
        int expected = 2;
        int actual = Main.countVowels(text);
        assertEquals(expected, actual);
    }

    @Test
    void mergeArrays_returns12345_whenEntered12and34And5(){
        int[] a = {1,2};
        int[] b = {3,4};
        int[] c = {5};

        int[] expected = {1,2,3,4,5};
        int[] actual = Main.mergeArrays(a,b,c);

        assertArrayEquals(expected, actual);
    }
}