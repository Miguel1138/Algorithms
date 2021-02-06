package com.miguel_santos.sort;

import org.junit.Test;

import java.util.Arrays;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static org.junit.Assert.assertArrayEquals;

public class InsertionSort {

    public void insertionSort(int[] vetor) {
        int j;
        int i;
        int key;
        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; i >= 0 && vetor[i] > key; i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

    @Test
    public void positiveTest() {
        int[] vetorAtual = {2, 4, 5, 6, 7, 5, 3, 2, 1, 20};
        int[] vetorFinal = {1, 2, 2, 3, 4, 5, 5, 6, 7, 20};

        insertionSort(vetorAtual);
        assertArrayEquals(vetorFinal, vetorAtual);
    }
}
