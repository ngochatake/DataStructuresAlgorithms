package com.hatake.ude.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {5, -32, 11, -2, 99, 62};

        for (int i = 0; i < intArray.length; i++) {
           for (int j = i; j < intArray.length - 1; j++) {
               if (intArray[j] > intArray[j + 1]) {
                   swap(intArray, j, j + 1 );
               }
           }
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void swap(int[] IntArray, int i, int j) {
        int temp = IntArray[i];
        IntArray[i] = IntArray[j];
        IntArray[j] = temp;
    }
}
