package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer N = 20;
        for (int i = 2; i < N; i++) {
            arrayList.add(fib(i));
        }
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }

    public static Integer fib(int N) {
        Vector<Integer> dp = new Vector<>();
        dp.setSize(N + 1);
        dp.set(1, 1);
        dp.set(2, 1);
        for (int i = 3; i <= N; i++) {
            dp.set(i, dp.get(i - 1) + dp.get(i - 2));
        }
        return dp.get(N);
    }
}
