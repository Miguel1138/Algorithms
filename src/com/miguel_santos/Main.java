package com.miguel_santos;

import com.miguel_santos.sort.BubbleSort;
import com.miguel_santos.sort.InsertionSort;
import com.miguel_santos.sort.MergeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://www.devmedia.com.br/algoritmos-de-ordenacao-em-java/32693
 */

public class Main {

    public static void main(String[] args) {
        int quantidade = (int) Math.pow(10, 7);
        int[] vetor = new int[Math.toIntExact(quantidade)];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        //new BubbleSort().bubbleSort(vetor);
        new MergeSort().mergeSort(vetor);
        //new InsertionSort().insertionSort(vetor);
        long tempoFinal = System.currentTimeMillis();

    }


    @Test
    public void positiveTest() {
        int[] actual = {5, 6, 2, 1, 9, 8, 7, 6, 5, 4};
        int[] expected = {1, 2, 4, 5, 5, 6, 6, 7, 8, 9};
        long tempoInicial = System.currentTimeMillis();
        new InsertionSort().insertionSort(actual);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + "ms");
        assertArrayEquals(actual, expected);
    }

}
