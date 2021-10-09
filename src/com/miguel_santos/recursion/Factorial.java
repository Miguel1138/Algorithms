package com.miguel_santos.recursion;

public class Factorial {
    public static int fact(int n) {
        return (n >= 1) ? n * fact(n - 1) : 1;
    }
}
