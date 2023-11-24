package org.example.ArraysAndHashing;

public class ProductOfArrayExceptSelfMedium {

    //Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    //
    //The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    //
    //You must write an algorithm that runs in O(n) time and without using the division operation.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [1,2,3,4]
    //Output: [24,12,8,6]

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }

        return ans;
    }
}
