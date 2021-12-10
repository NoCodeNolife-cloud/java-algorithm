package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<ArrayList<Integer>, Integer> memo = new HashMap<>();
        System.out.println(superEggDrop(3, 20));
        System.out.println(anotherMethod(3, 20));
    }

    /**
     * @param K Integer:egg
     * @param N Integer:floor
     * @return Integer:res
     */
    public static Integer superEggDrop(Integer K, Integer N) {
        HashMap<ArrayList<Integer>, Integer> memo = new HashMap<>();
        return eggDrop(K, N, memo);
    }

    public static Integer eggDrop(Integer K, Integer N, HashMap<ArrayList<Integer>, Integer> memo) {
        if (K == 1) {
            return N;
        }
        if (N == 0) {
            return 0;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(K);
        temp.add(N);
        if (memo.containsKey(temp)) {
            return memo.get(temp);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            res = Math.min(res, Math.max(eggDrop(K - 1, i - 1, memo), eggDrop(K, N - i, memo)) + 1);
        }
        memo.put(temp, res);
        return res;
    }

    public static Integer anotherMethod(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        int m = 0;
        while (dp[K][m] < N) {
            m++;
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k][m - 1] + dp[k - 1][m - 1] + 1;
            }
        }
        return m;
    }
}
