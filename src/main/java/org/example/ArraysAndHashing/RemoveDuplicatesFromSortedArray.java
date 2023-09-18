package org.example.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {

    //Example 1:
    //
    //Input: nums = [1,1,2]
    //Output: 2, nums = [1,2,_]
    //Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).
    //
    //Example 2:
    //
    //Input: nums = [0,0,1,1,1,2,2,3,3,4]
    //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    //Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).
    public int removeDuplicates(int[] nums) {

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(Integer i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i,i);
            }
        }
        //od zerowego indexu az do rozmiaru mapy to sie zgadza ale zeby teraz iterow
        int x = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                nums[x] = entry.getKey();
                x++;
        }

        System.out.println(map);





        return map.size();
    }
}
