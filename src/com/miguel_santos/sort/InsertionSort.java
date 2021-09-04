package com.miguel_santos.sort;

import org.jetbrains.annotations.NotNull;

public class InsertionSort {
    public static void sort(int @NotNull [] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }

    public static int[] nonIncreasingSort(int[] array) {
        int key;
        for (int i = array.length - 2; i >= 0; i--) {
            key = array[i];
            int j = i + 1;
            while (j < array.length && array[j] < key) {
                //Verify the numbers in the indexes and if needs to swap them.
                array[j - 1] = array[j];
                j++;
            }
            // array in the last position
            array[j - 1] = key;
        }
        return array;
    }

}
