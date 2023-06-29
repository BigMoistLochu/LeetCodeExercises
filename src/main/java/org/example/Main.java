package org.example;

import org.example.ArraysAndHashing.ContainsDuplicateEasy;
import org.example.ArraysAndHashing.ContainsDuplicateIIEasy;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCodeProblems");



        int[] a = {1,2,3,1};
        int[] b = {1,0,1,1};
        int[] c = {1,2,3,1,2,3};

        ContainsDuplicateIIEasy containsDuplicateIIEasy = new ContainsDuplicateIIEasy();



        System.out.println(containsDuplicateIIEasy.containsNearbyDuplicate(a,3));
        System.out.println(containsDuplicateIIEasy.containsNearbyDuplicate(b,1));
        System.out.println(containsDuplicateIIEasy.containsNearbyDuplicate(c,2));
    }
}