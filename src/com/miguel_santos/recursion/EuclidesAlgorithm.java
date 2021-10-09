package com.miguel_santos.recursion;

public class EuclidesAlgorithm {
    // máximo divisor comum (chamada recursiva)
    // Algoritmo de Euclides
    public static int mdc(int n1, int n2) {
        return n2 == 0 ? n1 : mdc(n2, n1 % n2);
    }
}
