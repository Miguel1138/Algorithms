package com.miguel_santos;

import com.miguel_santos.clrs.exercises.AddBinary;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = {1,0,0};
        int[] secondArray = {1,1,1};

        int[] result = AddBinary.addBinary(firstArray, secondArray);
        for (int i= 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }

}
