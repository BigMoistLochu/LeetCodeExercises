package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberEasyTest {

    MissingNumberEasy missingNumberEasy = new MissingNumberEasy();
    @Test
    void missingNumberShouldReturnMissingNumberIs8() {
        int[] list = {9,6,4,2,3,5,7,0,1};
        assertEquals(8,missingNumberEasy.missingNumber(list));
    }

    @Test
    void missingNumberShouldReturnMissingNumberIs2() {
        int[] list = {9,6,4,8,3,5,7,0,1};

        assertEquals(2,missingNumberEasy.missingNumber(list));
    }
    @Test
    void missingNumberShouldReturnMissingNumberIs5() {
        int[] list = {9,6,4,8,3,2,7,0,1};

        assertEquals(5,missingNumberEasy.missingNumber(list));
    }

    @Test
    void missingNumberShouldReturnMissingNumberIs1() {
        int[] list = {9,6,4,8,3,2,7,0,5};

        assertEquals(1,missingNumberEasy.missingNumber(list));
    }

    @Test
    void missingNumberShouldReturnMissingNumberIs7() {
        int[] list = {9,6,4,8,3,2,1,0,5};

        assertEquals(7,missingNumberEasy.missingNumber(list));
    }

    @Test
    void missingNumberShouldReturnMissingNumberIs9() {
        int[] list = {7,6,4,8,3,2,1,0,5};

        assertEquals(9,missingNumberEasy.missingNumber(list));
    }

    @Test
    void missingNumberShouldReturnMissingNumberIs6() {
        int[] list = {7,9,4,8,3,2,1,0,5};

        assertEquals(6,missingNumberEasy.missingNumber(list));
    }
    @Test
    void missingNumberShouldReturnMissingNumberIs0() {
        int[] list = {7,9,4,8,3,2,1,6,5};

        assertEquals(0,missingNumberEasy.missingNumber(list));
    }
}