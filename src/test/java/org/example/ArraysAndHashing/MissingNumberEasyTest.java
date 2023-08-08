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
}