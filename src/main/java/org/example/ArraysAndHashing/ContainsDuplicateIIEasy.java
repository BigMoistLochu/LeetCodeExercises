package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class ContainsDuplicateIIEasy {
    //Given an integer array nums and an integer k,
    //return true if there are two distinct indices i and j in the array such that
    // nums[i] == nums[j] and abs(i - j) <= k.

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //nums to tablica
        //k to nasza szukana liczba

        //dla kazdej liczby bedzie hashmapa ktora bedzie miala klucz:liczba -> value:pierwszy index
        Map<Integer,Integer> map = new HashMap<>();
        boolean flaga = false;
        for (int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(i-map.get(nums[i]) <= k)
                {
                    flaga = true;
                    break;
                }
                else
                {
                    map.put(nums[i],i);
                }
            }
            else
            {
                map.put(nums[i],i);
            }
        }


        return flaga;
    }
}
