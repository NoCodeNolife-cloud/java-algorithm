package com.NoCodeNoLife;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }

    public static Integer fib(Integer N) {
        if (N < 1) {
            return 0;
        }
        // 备忘录全初始化为0
        Vector<Integer> memo = new Vector<>();
        memo.setSize(N + 1);
        // 初始化最简情况
        return helper(memo, N);
    }

    public static Integer helper(Vector<Integer> memo, Integer n) {
        // 最简情况
        if (n == 1 || n == 2) {
            return 1;
        }
        // 已经计算过
        memo.set(n, helper(memo, n - 1) + helper(memo, n - 2));
        return memo.get(n);
    }
}
