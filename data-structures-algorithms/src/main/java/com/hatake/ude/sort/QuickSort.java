package com.hatake.ude.sort;

public class QuickSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //First run: -22, 1, -15, 7, 20, 55, 35
        doQuickSort(intArray, 0, intArray.length);

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void doQuickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        doQuickSort(input, start, pivotIndex);
        doQuickSort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[i] = pivot;

        return i;
    }
}