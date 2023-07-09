package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class GreatestCommonDivisorOfStringsEasy {

    //For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
    //
    //Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

    //Input: str1 = "ABCABC", str2 = "ABC"
    //Output: "ABC"

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

}
