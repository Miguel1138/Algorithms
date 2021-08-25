package com.miguel_santos.sort;

// Source https://www.baeldung.com/java-merge-sort
public class MergeSort {
    public static void mergeSort(int[] array) {
        int totalIndexes = array.length;
        if (totalIndexes < 2) {
            return;
        }
        int mid = totalIndexes / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[totalIndexes - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < totalIndexes; i++) {
            rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray, mid, totalIndexes - mid);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0;
        int j = 0;
        int key = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[key++] = leftArray[i++];
            } else {
                array[key++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[key++] = leftArray[i++];
        }
        while (j < right) {
            array[key++] = rightArray[j++];
        }
    }


}
