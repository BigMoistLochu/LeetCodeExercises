package org.example;

import org.example.ArraysAndHashing.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCodeProblems:");



        int[] a = {1,4,1,3};
        int[] b = {2,3,4};
        int[] c = {2,2,1,1,1,2,2};
        int[] nums1 = {3,2,2,3};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;
        int val = 3;
        String str1 = "ABCABC";
        String str2 = "ABC";

        MedianOfTwoSortedArraysHard medianOfTwoSortedArraysHard = new MedianOfTwoSortedArraysHard();
        medianOfTwoSortedArraysHard.findMedianSortedArrays(a,b);
    }
}