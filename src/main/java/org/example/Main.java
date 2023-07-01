package org.example;

import org.example.ArraysAndHashing.ContainsDuplicateEasy;
import org.example.ArraysAndHashing.ContainsDuplicateIIEasy;
import org.example.ArraysAndHashing.MajorityElementEasy;
import org.example.recruitmentTasks.TheThreeMostRepeatedWordsTaskOne;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCodeProblems:");



        int[] a = {1,2,3,1};
        int[] b = {1,0,1,1};
        int[] c = {2,2,1,1,1,2,2};

        String ape = "aba d d k cs aba i aba u";

        TheThreeMostRepeatedWordsTaskOne task1 = new TheThreeMostRepeatedWordsTaskOne();

        System.out.println(task1.getThreeMostRepeatedWords(ape));

    }
}