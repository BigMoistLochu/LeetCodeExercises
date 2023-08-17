package org.example.recruitmentTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheThreeMostRepeatedWordsTaskOneTest {

    TheThreeMostRepeatedWordsTaskOne theThreeMostRepeatedWordsTaskOne = new TheThreeMostRepeatedWordsTaskOne();
    @Test
    void getThreeMostRepeatedWordsShouldReturnIAndAbaAndB() {

        String ape = "aba d d k cs aba i aba u d aba i i i i i";

        assertEquals("i",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[0]);
        assertEquals("aba",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[1]);
        assertEquals("d",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[2]);
    }

    @Test
    void getThreeMostRepeatedWordsShouldReturnTrue() {

        String ape = "aba d d k cs aba i aba u d aba i i i i i x x x x x x x x x";

        assertEquals("x",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[0]);
        assertEquals("i",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[1]);
        assertEquals("aba",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[2]);
    }

    @Test
    void getThreeMostRepeatedWordsShouldReturnFalse() {

        String ape = "aba d d k cs aba i aba u d aba i i i i i x x x x x x x x x";
        assertNotEquals("xaba",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[0]);
        assertNotEquals("xd",theThreeMostRepeatedWordsTaskOne.getThreeMostRepeatedWords(ape)[1]);

    }
}