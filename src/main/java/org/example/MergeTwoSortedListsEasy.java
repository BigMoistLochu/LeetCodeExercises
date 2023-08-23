package org.example;

import java.util.LinkedList;

public class MergeTwoSortedListsEasy {

    public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        LinkedList<Integer> newSortedList = new LinkedList<>();


        int k = 0;

        for(int i=0;i<list1.size();i++)
        {
            int numberList1 = list1.get(i);
            int numberList2 = list2.get(i);

            if(numberList1>numberList2)
            {
                newSortedList.add(k, numberList2);
                k++;
                newSortedList.add(k, numberList1);
            }
            else
            {
                newSortedList.add(k, numberList1);
                k++;
                newSortedList.add(k, numberList2);
            }
        }



        return newSortedList;
    }
}
