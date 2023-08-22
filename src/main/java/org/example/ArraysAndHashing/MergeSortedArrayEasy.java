package org.example.ArraysAndHashing;

public class MergeSortedArrayEasy {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //pomysl taki pierw laczymy tablice a potem sortujemy i wyrzucamy tablice
        int k = 0;
        for(int i = m; i < n+m; i++) {
           nums1[i]   = nums2[k];
           k++;
        }


        for (int i = 0; i < nums1.length; i++) {

            for (int j = 1; j < nums1.length; j++) {

                int a = nums1[j-1];
                int b = nums1[j];

                if(a>b)
                {
                    nums1[j-1] = b;
                    nums1[j] = a;
                }

            }

        }



    }
}
