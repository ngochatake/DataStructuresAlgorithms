package com.hatake.ude.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] IntArray = {5, -32, 11, 107, 19, 62};

        for (i = 0; i < IntArray.length; i++) {
           for (j = i; j < IntArray.length - 1; j++) {
               if (IntArray[j] > IntArray[j + 1]) {
                   swap(IntArray, j, j + 1 );
               }
           }
        }

        for (int i : IntArray) {
            System.out.println(IntArray[i]);
        }
    }
    public static void swap(int[] IntArray, int i, int j) {
        int temp = IntArray[i];
        IntArray[i] = IntArray[j];
        IntArray[j] = IntArray[i];
    }
}
