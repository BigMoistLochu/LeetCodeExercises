package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateEasyTest {


    ContainsDuplicateEasy containsDuplicateEasy = new ContainsDuplicateEasy();
    @Test
    void containsDuplicateMethodShouldEquelsTrue() {

        int[] table = {1,2,3,1};
        assertTrue(containsDuplicateEasy.containsDuplicate(table));
    }

    @Test
    void containsDuplicateMethodShouldEquelsFalse() {

        int[] table = {0,2,3,1};
        assertFalse(containsDuplicateEasy.containsDuplicate(table));
    }
}