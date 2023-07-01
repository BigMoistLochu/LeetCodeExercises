package org.example;

import org.example.ArraysAndHashing.ContainsDuplicateEasy;
import org.example.ArraysAndHashing.ContainsDuplicateIIEasy;
import org.example.ArraysAndHashing.MajorityElementEasy;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCodeProblems");



        int[] a = {1,2,3,1};
        int[] b = {1,0,1,1};
        int[] c = {2,2,1,1,1,2,2};

        MajorityElementEasy majorityElementEasy = new MajorityElementEasy();

        majorityElementEasy.majorityElement(c);

    }
}