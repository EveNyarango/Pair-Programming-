package com.pairprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordPositionTest {

    @Test
    void checkWordPositionMethod(){
        //Given
        String words = "Ask not what your country can do for you ask what you can do for your country";
        //When
        String expected = WordPosition.checkWordPosition(words);
        //Then
        assertEquals(expected, "01234567802856734" );
    }
}