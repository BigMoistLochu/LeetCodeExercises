package org.example.ArraysAndHashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleEasy {

    public static void main(String[] args) {

        generate(5);

    }
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //In Pascal's triangle,
    // each number is the sum of the two numbers directly above it as shown:
    //###EXAMPLE1
    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1]]


    public static List<List<Integer>> generate(int numRows) {

        //ilosc tablic to numRows
        //wszystkie boczne cyfy beda zaczynac sie od 1
        //zmieniaja sie tylko cyfry ktore nie sa bokami

        List<List<Integer>> listList = new ArrayList<>();
        listList.add(new ArrayList<>(List.of(1)));
        listList.add(new ArrayList<>(List.of(1,1)));

        for (int i = 1; i < numRows-1; i++) {

            List<Integer> listaPoprzednia = listList.get(i);
            //sumujemy liczby

        }

        System.out.println(listList);
        return new ArrayList<>();
    }
}
