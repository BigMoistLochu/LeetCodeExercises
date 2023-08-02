package org.example.ArraysAndHashing;

public class MedianOfTwoSortedArraysHard {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //posortowane liczby,znasz poczatek nums2 i koniec nums1
        //jesli poczatek jest mniejszy niz koniec nums1 to znaczy ze wpinamy w srodek


        int firstNumberOfNums2 = nums2[0]; //poczatek
        int lastNumberOfNums1 = nums1[nums1.length-1]; //koniec
        int newArray[] = new int[nums1.length+nums2.length];

        if(firstNumberOfNums2>lastNumberOfNums1)
        {
            for (int i = 0; i < newArray.length; i++) {

            }
        }

        //imitacja mergowania
        //rozmiar to bedzie n+m
        //przypadek 1
        ////jesli poczatek jest wiekszy niz koniec nums1 to spinamy
        //to znaczy ze mediana czyli srodkowy wyraz n+m%2

        if((nums1.length+nums2.length)%2==0)
        {

            System.out.println("sa parzyste wiec bierzemy 2 srodkowe");
        }
        else
        {
            System.out.println("srodkowy wyraz" );
        }

        return 1;
    }
}
