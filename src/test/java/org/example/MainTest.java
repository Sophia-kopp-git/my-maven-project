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
}