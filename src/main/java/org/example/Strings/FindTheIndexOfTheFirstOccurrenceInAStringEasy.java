package org.example.Strings;

public class FindTheIndexOfTheFirstOccurrenceInAStringEasy {
    public static void main(String[] args) {

        String haystack = "butsad", needle = "sadd";

        System.out.println(strStr(haystack,needle));

    }

    //Given two strings needle and haystack,
    // return the index of the first occurrence of needle in haystack,
    // or -1 if needle is not part of haystack.

//    Example 1:
//
//    Input: haystack = "sadbutsad", needle = "sad"
//    Output: 0
//    Explanation: "sad" occurs at index 0 and 6.
//    The first occurrence is at index 0, so we return 0.


    public static int strStr(String haystack, String needle) {

            return haystack.indexOf(needle);

    }
}
