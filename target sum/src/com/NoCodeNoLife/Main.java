package com.NoCodeNoLife;

// Given an array of non-negative integers, a1, A2.... An and a target number, s. Now you have two symbols + and -.
// For any integer in the array, you can add a symbol from + or - to the front of it.
// Returns the number of methods that can make the final array and add symbols to the target number S.
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println("the result is " + findTargetSumWays(nums, 3));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) sum += n;
        // In those two cases, we don't have the possibility to divide the divide collections.
        if (sum < target || (sum + target) % 2 == 1) {
            return 0;
        }
        return subsets(nums, (sum + target) / 2);
    }

    // count for the number of subset sums arrays equal to sum value
    public static int subsets(int[] nums, int sum) {
        int n = nums.length;
        int[][] dp = new int[n + 1][sum + 1];
        // base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j >= nums[i-1]) {
                    // The sum of two ways to choose
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                } else {
                    // Backpack space is insufficient, can only choose not to pack item I
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
