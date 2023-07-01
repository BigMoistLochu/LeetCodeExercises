package org.example.recruitmentTasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheThreeMostRepeatedWordsTaskOne {


    //zadanie rekturacyjne

    //wypisz 3 najczesciej pojawiajace sie slowa
    //na wejsciu dostajesz Stringa i masz zwrocic tablice w kolejnosci rosnacej 3 slowa
    //np String = "da da ka ka ka dd d ka z z"
    //masz nie zliczac znakow specialnych takich jak !@#$%^&*


    public String getThreeMostRepeatedWords(String str)
    {
        String[] tab = str.split("[\\s*[*^#]\\s*]");
        Map<String,Integer> map = new HashMap<>();

        String[] tablicaTop = {"!","!","!"};
        String MostRepetedString = "";
        int temporaryNumber1 = 0;
        int[] sortedTab = {1,1,1};

        for (String s:tab) {

            if(map.containsKey(s))
            {
                map.put(s,map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
        }

        for (int i = 0; i < map.size(); i++) {


        }



        for(Map.Entry<String,Integer> entry : map.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            //a:3
            //kdds:3
            if(value>temporaryNumber1)
            {
                temporaryNumber1 = value;
                MostRepetedString = key;
            }

        }



        return MostRepetedString;
    }



}
