package com.miguel_santos.sort;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int aux;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
