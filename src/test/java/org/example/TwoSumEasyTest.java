package org.example;

import org.example.ArraysAndHashing.TwoSumEasy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumEasyTest {

    private TwoSumEasy twoSumEasy = new TwoSumEasy();
    @Test
    void twoSumMethodShouldEqualsTwo() {

        //Input: nums = [3,4,8,9], target = 12
        //Output: [0,2]
        //Explanation: Because nums[0] + nums[2] == 1, we return array [0, 1].


        int[] nums = {3,4,8,9};
        int target = 12;

        assertEquals(2,twoSumEasy.twoSum(nums,target).length);

    }

    @Test
    void twoSumMethodShouldEqualsFour() {

        //Input: nums = [3,4,8,9], target = 12
        //Output: [0,2]
        //Explanation: Because nums[0] + nums[2] == 1, we return array [0, 1].


        int[] nums = {3,4,8,9};
        int target = 12;

        assertEquals(2,twoSumEasy.twoSum(nums,target).length);

    }


    @Test
    void FirstIndexOfReturnShouldEqualsZero() {

        //Input: nums = [3,4,8,9], target = 11
        //Output: [0,2]
        //Explanation: Because nums[0] + nums[2] == 1, we return array [0, 1].
        int[] nums = {3,4,8,9};
        int target = 12;
        assertEquals(0,twoSumEasy.twoSum(nums,target)[0]);
    }

    @Test
    void SecondIndexOfReturnShouldEqualsNine() {

        //Input: nums = [3,4,8,9], target = 11
        //Output: [0,2]
        //Explanation: Because nums[0] + nums[2] == 1, we return array [0, 1].
        int[] nums = {3,4,8,9};
        int target = 12;
        assertEquals(9,twoSumEasy.twoSum(nums,target)[1]);
    }
}