package com.miguel_santos.recursion;

public class Fibonacci {
    public static int fib(int n) {
        // Fibonacci Fn = Fn-1 + Fn-2
        return (n > 1) ? fib(n - 1) + fib(n - 2) : n;
    }
}
