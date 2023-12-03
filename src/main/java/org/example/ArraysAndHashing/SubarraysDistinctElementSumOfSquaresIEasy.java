package org.example.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class SubarraysDistinctElementSumOfSquaresIEasy {

    //You are given a 0-indexed integer array nums.
    //
    //The distinct count of a subarray of nums is defined as:
    //
    //    Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
    //
    //Return the sum of the squares of distinct counts of all subarrays of nums.
    //
    //A subarray is a contiguous non-empty sequence of elements within an array.
    public static void main(String[] args) {
        //wywolanie

        //testy
    }
    public static int sumCounts(List<Integer> nums) {



        return nums.size();
    }

    public static void testSumCounts()
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);

        if(nums.size()==2)
        {
            System.out.println("yes");
        }
    }
}
