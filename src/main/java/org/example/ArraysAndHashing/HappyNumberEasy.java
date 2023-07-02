package org.example.ArraysAndHashing;

public class HappyNumberEasy {


    public boolean isHappy(int n) {
        int[] array = new int[n];
        int suma = 0;
        Integer a = n;
        char[] numberToString = a.toString().toCharArray();

        boolean flaga = false;
        for (int i = 0; i < array.length; i++) {

            suma=suma+array[i]*array[i];
        }

        if(suma==1)
        {
            flaga = true;
        }
        else
        {
            isHappy(suma);
        }

        return flaga;
    }

}
