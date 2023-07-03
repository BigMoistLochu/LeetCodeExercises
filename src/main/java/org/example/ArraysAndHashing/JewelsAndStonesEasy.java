package org.example.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStonesEasy {

    //You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
    //
    //Letters are case sensitive, so "a" is considered a different type of stone from "A".
    //Input: jewels = "aA", stones = "aAAbbbb"
    //Output: 3
    public int numJewelsInStones(String jewels, String stones) {

        char[] tabOfStones = stones.toCharArray();
        char[] tabOfJewels = jewels.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < tabOfStones.length; i++) {

            if(!map.containsKey(tabOfStones[i]))
            {
                map.put(tabOfStones[i],1);
            }
            else
            {
                map.put(tabOfStones[i],map.get(tabOfStones[i])+1);
            }
        }

        int suma = 0;

        for (int i = 0; i < tabOfJewels.length; i++) {

            if(map.containsKey(tabOfJewels[i]))
            {
                suma = suma + map.get(tabOfJewels[i]);
            }

        }


        return suma;
    }
}
