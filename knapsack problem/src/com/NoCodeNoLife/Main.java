package com.NoCodeNoLife;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] wt = {2, 1, 3};
        Integer[] val = {4, 2, 3};
        System.out.println(knapsackProblem(4, 3, wt, val));
    }

    public static Integer knapsackProblem(Integer W, Integer N, Integer[] wt, Integer[] val) {
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (w - wt[i - 1] < 0) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = Math.max(dp[i - 1][w - wt[i - 1]] + val[i - 1], dp[i - 1][w]);
                }
            }
        }
        return dp[N][W];
    }
}
