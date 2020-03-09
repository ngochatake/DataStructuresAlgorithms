package com.hatake.ude.sort;

public class CountingSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        int[] temp = new int[intArray.length + 1]; // probably length of array = max number
        int[] sortedArray = new int[intArray.length + 1];
        for (int i : intArray) {
           temp[i] = temp[i] + 1;
        }

       for (int i = 0; i < temp.length; i ++) {
          int tempValue = temp[i];
          int k = 0;
          while (tempValue > 0) {
              sortedArray[i + k] = i;
              tempValue--;
              k++;
          }
       }

        for (int i : sortedArray) {
           System.out.println(i);
        }

        System.out.printf("Millis: %d" , System.currentTimeMillis() - start);
    }
}
