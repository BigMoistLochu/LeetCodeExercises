package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumEasy {


    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //You can return the answer in any order.
    //EXAMPLE:
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> dictionary = new HashMap<>();
        int[] twoIndexOfTarget = new int[2];
        int number;

        for(int i=0;i<nums.length;i++)
        {
            number = target - nums[i];

            if(dictionary.containsKey(number))
            {
                twoIndexOfTarget[0] = dictionary.get(number).intValue();
                twoIndexOfTarget[1] = nums[i];
            }
            else
            {
                dictionary.put(nums[i],i);
            }

        }

        return twoIndexOfTarget;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums,target)[0]);
    }
}
