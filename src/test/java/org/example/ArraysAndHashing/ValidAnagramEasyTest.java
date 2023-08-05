package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramEasyTest {

    ValidAnagramEasy validAnagramEasy = new ValidAnagramEasy();

    @Test
    void isAnagramShouldReturnTrue() {


        assertTrue(validAnagramEasy.isAnagram("apes","sepa"));
    }

    @Test
    void isAnagramShouldReturnFalse() {


        assertFalse(validAnagramEasy.isAnagram("apes","sepa"));
    }
}