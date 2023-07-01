package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementEasy {

    //Given an array nums of size n, return the majority element.
    //
    //The majority element is the element that appears more than ⌊n / 2⌋ times.
    // You may assume that the majority element always exists in the array.
    //example
    //Input: nums = [2,2,1,1,1,2,2]
    //Output: 2  -> n=7 -> 7/2=3,5 if ilosc wystapien > 3.5 to jest to najwieksza liczba
    public int majorityElement(int[] nums) {


        Map<Integer,Integer> map = new HashMap<>();
        int temporarValue = 0;
        int majority = 0;



        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(value>temporarValue)
            {
                temporarValue = value;
                majority = key;
            }

        }


        return majority;
    }



}
