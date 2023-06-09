package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberEasy {
    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.

    //Input: nums = [9,6,4,2,3,5,7,0,1]
    //Output: 8
    //Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
    // 8 is the missing number in the range since it does not appear in nums.
    public int missingNumber(int[] nums) {
            //simpler solution than before
            int arr[] = new int[nums.length + 1];
            for(int i=0;i<nums.length;i++)
            {
                arr[nums[i]] = 1;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] == 0)
                {
                    return i;
                }
            }

        return -1;
    }
}
