package com.noCodeNOLife;

import java.util.Vector;

public class Fibonacci {

    private Vector<Long> cnt;

    public Fibonacci(int maxsize) {

        cnt = new Vector<>();
        cnt.setSize(maxsize);
        Count();
    }

    private void Count() {

        cnt.set(0, (long) 1);
        cnt.set(1, (long) 1);

        for (int i = 2; i < cnt.size(); ++i) {

            cnt.set(i, (long) (cnt.get(i - 1) + cnt.get(i - 2)));
        }
    }

    public long get(int index) {

        return cnt.get(index);
    }
}
