package com.hatake.ude.sort;

public class BubblePractice {
    public static void main(String[] args) {
       int[] arr = {4, -4, 5, 18, -1, 0, 10, 19, 28, 95,22,66,15,15,74,26,21,63,16, -42, 1000};

       for (int unsortedIdx = 1; unsortedIdx < arr.length; unsortedIdx++) {
           if (arr[unsortedIdx] < arr[unsortedIdx - 1]) {
               insertSort(arr, unsortedIdx);
           }
       }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void insertSort(int[] arr, int unsortedIdx) {
        int tmp = arr[unsortedIdx];
        while (unsortedIdx > 0 && tmp < arr[unsortedIdx - 1] ) {
            arr[unsortedIdx] = arr[unsortedIdx - 1];
            unsortedIdx--;
        }
        arr[unsortedIdx] = tmp;
    }

}
