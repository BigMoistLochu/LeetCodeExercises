package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramEasyTest {

    ValidAnagramEasy validAnagramEasy = new ValidAnagramEasy();

    @Test
    void isAnagram() {


        assertTrue(validAnagramEasy.isAnagram("apes","sepa"));
    }
}