package com.miguel_santos.leetCode;

/**
 * https://leetcode.com/problems/palindrome-number/
 * <p>
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 */
public class CheckPalindrome {
    public static boolean isPalindrome(int x) {
        char[] characters = Integer.toString(x).toCharArray();
        String inversedX = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            inversedX += characters[i];
        }
        return inversedX.equals(String.valueOf(x));
    }

    public static boolean isPalíndromeButFaster(int x) {
        // Qualquer número negativo não pode ser palíndromo
        // A segunda validção é para numeros que terminam em múltiplos de 10.
        // pois, por exemplo, 10 não é o mesmo que 01
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        // o segundo parametro remove o meio do número movendo a virgula para frente.
        return reverseNum == x || x == reverseNum / 10;
    }
}
