package org.example.ArraysAndHashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleEasy {

    public static void main(String[] args) {

        System.out.println(generate(5));

    }
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //In Pascal's triangle,
    // each number is the sum of the two numbers directly above it as shown:
    //###EXAMPLE1
    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1]]


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));

            allrows.add(new ArrayList<>(row));
        }
        return allrows;
    }
}
