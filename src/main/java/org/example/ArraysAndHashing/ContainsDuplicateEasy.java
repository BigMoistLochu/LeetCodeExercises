package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateEasy {

    //Given an integer array nums, return true if any value appears at least twice in the array
    //and return false if every element is distinct.

    public boolean containsDuplicate(int[] nums) {

        //w liscie znajduja sie liczby
        //teraz mozna uzyc hashmapy i zliczac numery wygladalo by to tak:
        //key: int liczba,value int ileRazy

        Map<Integer,Integer> dictionary = new HashMap<>();
        boolean flaga = false;

        for (int i = 0; i < nums.length; i++)
        {

            if(dictionary.containsKey(nums[i]))
            {
                if(dictionary.get(nums[i]).intValue()>=2)
                {
                    flaga = true;
                    break;
                }
                else
                {
                    dictionary.put(nums[i],dictionary.get(nums[i]).intValue()+1);
                }
            }
            else
            {
                dictionary.put(nums[i],1);
            }

        }

        if(dictionary.containsValue(2))
        {
            flaga = true;
        }


        return flaga;
    }
}
