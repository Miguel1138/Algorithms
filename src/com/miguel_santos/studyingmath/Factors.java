package com.miguel_santos.studyingmath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factors {
    public static void findFactors(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        int aux = 0;

        do {
            if (n % i == 0) {
                list.add(i);
                aux = n / i;
                if (!list.contains(aux)) list.add(aux);
            }

            i++;
            // Enquanto o valor de i não estiver dentro da lista retorna verdadeiro.
        } while (!list.contains(i));
        Collections.sort(list);

        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }
}
