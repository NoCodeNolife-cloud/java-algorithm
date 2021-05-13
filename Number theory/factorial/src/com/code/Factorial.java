package com.code;

public class Factorial {

    private long value[];

    public Factorial(int _num) {

        value = new long[_num];
        value[0] = 1;
        for (int i = 1; i < _num; ++i) {

            value[i] = value[i - 1] * i;
        }
    }

    public void print() {

        for (long item : value) {

            System.out.println(item);
        }
    }
}
