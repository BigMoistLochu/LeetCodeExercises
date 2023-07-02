package org.example.recruitmentTasks;

import java.util.*;

public class TheThreeMostRepeatedWordsTaskOne {


    //zadanie rekturacyjne

    //wypisz 3 najczesciej pojawiajace sie slowa
    //na wejsciu dostajesz Stringa i masz zwrocic tablice w kolejnosci rosnacej 3 slowa
    //np String = "da da ka ka ka dd d ka z z"
    //masz nie zliczac znakow specialnych takich jak !@#$%^&*


    public String[] getThreeMostRepeatedWords(String str)
    {
        String[] tab = str.split("[\\s*[*^#]\\s*]");
        Map<String,Integer> map = new HashMap<>();

        String[] tablicaTop = new String[3];
        String MostRepetedString = "";
        int temporaryNumber1 = 0;

        int[] sortedTab = new int[3];

        //tworzenie hashmapy gdzie klucz to slowo/litera a wartosc bedzie sie zwiekszac gdy pojawi w stringu
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


        //sortowanie wartosci
        List<Integer> newList = new ArrayList<>(map.values());
        Collections.sort(newList);

        //wyciaganie 3 najwiekszych wartosci i wrzucanie do tablicy "sortedTab"
        for(int i = 0; i < sortedTab.length; i++)
        {

            if(i==0)
            {
                sortedTab[i] = newList.get(map.size()-1);
            }
            else if(i==1)
            {
                sortedTab[i] = newList.get(map.size()-2);
            }
            else
            {
                sortedTab[i] = newList.get(map.size()-3);
            }
        }


        //nadawanie wartosci z mapy do tablicy gdzie przechowuja sie top 3 wyrazy
        for(Map.Entry<String,Integer> entry : map.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if(value==sortedTab[0])
            {
                tablicaTop[0] = key;
            }
            else if(value==sortedTab[1]) {
                tablicaTop[1] = key;
            }
            else if(value==sortedTab[2])
            {
                tablicaTop[2] = key;
            }

        }



        return tablicaTop;
    }



}
