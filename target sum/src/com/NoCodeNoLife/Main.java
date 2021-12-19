package com.NoCodeNoLife;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println("the result is " + findTargetSumWays(nums, 3));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        if (nums.length == 0) return 0;
        return dp(nums, 0, target);
    }

    // 备忘录
    public static HashMap<String, Integer> memo = new HashMap<>();

    public static int dp(int[] nums, int i, int rest) {
        // base case
        if (i == nums.length) {
            if (rest == 0) return 1;
            return 0;
        }
        // 把它俩转成字符串才能作为哈希表的键
        String key = i + "," + rest;
        // 避免重复计算
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        // 还是穷举
        int result = dp(nums, i + 1, rest - nums[i]) + dp(nums, i + 1, rest + nums[i]);
        // 记入备忘录
        memo.put(key, result);
        return result;
    }
}
