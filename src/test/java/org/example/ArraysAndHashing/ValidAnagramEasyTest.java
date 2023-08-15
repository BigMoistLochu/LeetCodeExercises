package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramEasyTest {

    ValidAnagramEasy validAnagramEasy = new ValidAnagramEasy();

    @Test
    void isAnagramShouldReturnTrue() {


        assertTrue(validAnagramEasy.isAnagram("apes","sepa"));
    }

    @Test
    void isAnagramShouldReturnFalse() {


        assertFalse(validAnagramEasy.isAnagram("apes","sepaa"));
    }

    @Test
    void isAnagramShouldReturnFalseWithAnotherParam() {

        assertFalse(validAnagramEasy.isAnagram("apes","sepaaj"));
    }

    @Test
    void isAnagramShouldReturnFalseWithAnotherParamExa() {

        assertFalse(validAnagramEasy.isAnagram("exa","eka"));
    }
}