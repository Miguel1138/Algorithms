package com.miguel_santos.clrs.exercises;

public class AddBinary {
    /**
     * Consider the problem of adding two n-bit binary integers, stored in two n-element arrays A and B.
     * The sum of the two integers should be stored in binary form in
     * an .n C 1/-element array C.
     * State the problem formally and write pseudocode for adding the two integers.
     * <p>
     * PSEUDOCODE:
     * n=Max(A.length,B.length)
     * let C[n+1] be  new  array
     * carry=0
     * for i=n to 0
     *      C[i]=(A[i]+B[i]+carry)mod2
     *      carry=⌊(A[i]+B[i]+carry)/2⌋
     * C[0]=carry
     * return C
     */

    /**
     * Method to sum two binary arrays, arrays with only 1 or 0, and return it's result.
     */
    public static int[] addBinary(int[] firstArr, int[] secondArr) {
        int carry = 0;
        int n = Math.max(firstArr.length, secondArr.length);
        int[] finalArr = new int[n + 1];

        int a = firstArr.length - 1;
        int b = secondArr.length - 1;

        for (int i = finalArr.length - 1; i >= 0; i--) {
            int j = (a >= 0) ? firstArr[a] : 0;
            a--;

            int k = (b >= 0) ? secondArr[b] : 0;
            b--;

            finalArr[i] = (j + k + carry) % 2;
            carry = (j + k + carry) / 2;
        }

        if (carry != 0) finalArr[0] = carry;

        return finalArr;
    }

    @Deprecated
    public static int[] sumBinaryArrays(int[] firstArray, int[] secondArray) {
        int index = Math.max(firstArray.length, secondArray.length);

        int[] finalArray = new int[index + 1];
        int carry = 0;

        int j = firstArray.length - 1;
        int k = secondArray.length - 1;

        for (int i = index - 1; i >= 0; i--) {
            int sum = carry;

            if (j >= 0) {
                sum += firstArray[j];
                j--;
            }

            if (k >= 0) {
                sum += secondArray[k];
                k--;
            }

            finalArray[i + 1] = sum % 2;
            carry = sum / 2;
        }

        // Corrije erro do array com valor 0 no inicio;
        if (carry != 0) {
            finalArray[0] = carry;
        } else {
            int[] correctedArray = new int[finalArray.length - 1];
            for (int i = correctedArray.length - 1; i >= 0; i--) {
                correctedArray[i] = finalArray[i + 1];
            }
            return correctedArray;
        }

        return finalArray;
    }

}
