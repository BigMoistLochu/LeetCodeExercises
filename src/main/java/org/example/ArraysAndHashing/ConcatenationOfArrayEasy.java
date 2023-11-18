package org.example.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationOfArrayEasy {


    //Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    //
    //Specifically, ans is the concatenation of two nums arrays.
    //
    //Return the array ans.

    public int[] getConcatenation(int[] nums) {

        int[] newarray = new int[nums.length*2];
        //10 0-9, 20 0-19/ 10 10-19
        int x = 0;
        for (int i = 0; i < newarray.length; i++) {
            //iterowanie bedzie od 0-19 ( 20 razy)
            if(i<10)
            {
                newarray[i] = nums[i];
            }
            else
            {
                newarray[i] = nums[x];
                x++;
            }
        }

        return newarray;
    }
}
