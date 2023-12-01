package org.example.ArraysAndHashing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZeroesEasyTest {
    @Test
    public void moveZeroesMethodShouldReturnListWhereAllZerosIsOnTheEnd()
    {   //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]
        int[] inputArray = {0,1,0,3,12};
        int[] outputArray = {1,3,12,0,0};

        MoveZeroesEasy.moveZeroes(inputArray);

        assertArrayEquals(outputArray,inputArray);
    }

    @Test
    public void moveZeroesMethodShouldReturnTwelveOnStart()
    {   //Input: nums = [0,0,0,0,12]
        //Output: [12,0,0,0,0]
        int[] inputArray = {0,0,0,0,12};
        int[] outputArray = {12,0,0,0,0};

        MoveZeroesEasy.moveZeroes(inputArray);

        assertArrayEquals(outputArray,inputArray);
    }

    @Test
    public void moveZeroesMethodShouldReturnTwelveOnMiddle()
    {   //Input: nums = [0,0,12,0,0]
        //Output: [12,0,0,0,0]
        int[] inputArray = {0,0,12,0,0};
        int[] outputArray = {12,0,0,0,0};

        MoveZeroesEasy.moveZeroes(inputArray);

        assertArrayEquals(outputArray,inputArray);
    }

    @Test
    public void moveZeroesMethodShouldReturnNothing()
    {
        int[] inputArray = null;

        MoveZeroesEasy.moveZeroes(inputArray);

        assertNull(inputArray);
    }




}
