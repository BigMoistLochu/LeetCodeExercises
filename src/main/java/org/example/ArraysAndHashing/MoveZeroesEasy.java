package org.example.ArraysAndHashing;

public class MoveZeroesEasy {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

    }

    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //
    //Note that you must do this in-place without making a copy of the array.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]

    public static void moveZeroes(int[] nums) {
        //wstaw -1 tam gdzie sa zera
        //
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

    }
}
