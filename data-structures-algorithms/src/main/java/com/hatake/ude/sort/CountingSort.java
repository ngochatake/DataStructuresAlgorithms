package com.hatake.ude.sort;

public class CountingSort {
    public static void main(String[] args) {
       int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
       int[] intArray2 = {-5, -10, 0, -3, 8, 5, -1, 10};

        countingSort(intArray, 2, 10);
        System.out.println();
        countingSort(intArray2, -10, 10);
    }

    public static void countingSort(int[] input, int min, int max) {
        long start = System.currentTimeMillis();
        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i ++) {
           while (countArray[i - min] > 0) {
               input[j++] = i;
               countArray[i - min]--;
           }
        }

        // MY OWN WAY
        /*for (int i = 0; i < countArray.length; i ++) {
            while (countArray[i] > 0) {
                input[j++] = i + min;
                countArray[i]--;
            }
        }*/

        for (int i : input) {
           System.out.println(i);
        }

        System.out.printf("Millis: %d" , System.currentTimeMillis() - start);
    }
}
