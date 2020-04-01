package com.hatake.ude.sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0 ; gap /= 2) {

           for (int i = gap; i < intArray.length; i++) {
               int newElement = intArray[i];

               int j = i;

               while (j >= gap && newElement < intArray[j - gap]) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
               }

               intArray[j] = newElement;

               /*for (int comparedIndex = j - gap; comparedIndex >= 0 && newElement < intArray[comparedIndex]; comparedIndex = comparedIndex - gap ) {
                    intArray[j] = intArray[comparedIndex];
                    j = comparedIndex;
               }
               intArray[j] = newElement;*/

               /*for (; j - gap >= 0 && newElement < intArray[j - gap]; j = j - gap) {
                   intArray[j] = intArray[j - gap];
               }
               intArray[j] = newElement;*/

            }
        }

        for (int i : intArray) {
            System.out.println(i);
        }

    }
}
