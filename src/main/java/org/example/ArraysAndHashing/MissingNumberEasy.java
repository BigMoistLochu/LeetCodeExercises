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

        //tablice rozbijamy na hashmape i przechodzimy przez klucze
        //wiec bedziemy miec unikalne wartosci
        //potem wystarczy zrobic pentle i iterowac wywolujac funkcje map.containsKeyI()
        Map<Integer,Integer> map = new HashMap<>();
        int missingNumber = -1;

        for (int i = 0; i < nums.length; i++) {

            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }
        }
        //mapa stworzona
        for (int i = 0; i < nums.length+1; i++) {
          if(!map.containsKey(i))
          {
              missingNumber = i;
          }
        }


        return missingNumber;
    }
}
