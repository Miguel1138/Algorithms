package com.miguel_santos.studyingmath;

public class Prime {
    // Crivo de Erástones
    private static boolean isPrime(int n) {
        // Take the firsts prime numbers
        if (n == 2 || n == 3 || n == 5 || n == 7) return true;

        // Then take out all of it's multiples.
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) return false;

        // 1 is not a Prime number because he's only divided by itself.
        // What remains is a Prime Number.
        return n != 1;
    }

    public static void getPrimeSequenceUntil(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static String getPrimeFactorizationOf(int number) {
        StringBuilder answer = new StringBuilder();

        int aux = number;
        // Initiates the value of i at the first prime number.
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                if (aux % i == 0) {
                    answer.append(i).append(" * ");
                    aux /= i;
                    // Uso do decremento no caso de ser possível dividir o resultado pelo mesmo valor de i.
                    i--;
                }
            }
        }
        if (isPrime(aux)) answer.append(aux);

        // Se houver '*' signifca que ele possui mais de um número na String, e como o for loop sempre deixa um
        // '*' sobrando no fim da String é preciso retirá-lo.
        // caso contrário retorna a própria string.
        return (answer.toString().contains("*"))
                ? answer.substring(0, answer.lastIndexOf("*"))
                : answer.toString();
    }
}
