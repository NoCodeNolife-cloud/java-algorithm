package com.noCodeNOLife;

public class MultiplicationTables {

    public MultiplicationTables() {

        for (int i = 1; i <= 9; ++i) {

            for (int j = 1; j <= i; ++j) {

                System.out.print(j + "¡Á" + i + "=" + i * j + " ");
            }

            System.out.println();
        }
    }
}
