package org.example.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementEasy {

    public int removeElement(int[] nums, int val) {


        List<Integer> map = new ArrayList<>();


        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                nums[i] = -1;
                k++;
            }
            else
            {
                map.add(nums[i]);
            }
        }

        for (int i = 0; i < map.size(); i++) {
            nums[i] = map.get(i);
        }




        return nums.length - k;
    }
}
