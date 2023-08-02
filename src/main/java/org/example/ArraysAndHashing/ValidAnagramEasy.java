package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramEasy {

//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//    An Anagram is a word or phrase formed by rearranging the letters of a different
//    word or phrase, typically using all the original letters exactly once.
    public boolean isAnagram(String s, String t) {


        char arrayOfS[] = s.toCharArray();
        char arrayOfT[] = t.toCharArray();

        if(arrayOfT.length>Integer.MAX_VALUE)
        {
            return true;
        }

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> mapOfT = new HashMap<>();

        if(arrayOfT.length!=arrayOfS.length) {
            return false;
        }

        for(Character ch:arrayOfS)
        {
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        }

        for(Character ch:arrayOfT)
        {
            if(!mapOfT.containsKey(ch))
            {
                mapOfT.put(ch,1);
            }
            else
            {
                mapOfT.put(ch,mapOfT.get(ch)+1);
            }

        }

        //w tym momencie mamy 2 hashmapy ze zliczonymi powtorzeniami

        for (Character ch:arrayOfT) {
            if(!map.containsKey(ch))
            {
                return false;
            }
            Integer b = mapOfT.get(ch);
            Integer a = map.get(ch);
            if(a != b)
            {
                return false;
            }
        }




        return true;
    }

}
