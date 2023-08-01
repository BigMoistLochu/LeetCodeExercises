package org.example;

import org.example.ArraysAndHashing.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCodeProblems:");



        int[] a = {1,2,3,1};
        int[] b = {1,0,1,1};
        int[] c = {2,2,1,1,1,2,2};
        int[] nums1 = {3,2,2,3};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;
        int val = 3;
        String str1 = "ABCABC";
        String str2 = "ABC";

//        GreatestCommonDivisorOfStringsEasy x = new GreatestCommonDivisorOfStringsEasy();

//        System.out.println(x.gcdOfStrings(str1,str2));

        HappyNumberEasy happyNumberEasy = new HappyNumberEasy();

        System.out.println(happyNumberEasy.isHappy(2));

    }
}