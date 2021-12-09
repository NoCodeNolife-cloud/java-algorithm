package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 查找数组中两个数等于目标
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 1, 4, 1, 4, 1, 4, 6, 2, 4, 7, 9, 0};
        ArrayList<Integer[]> arrayList = findSum(nums, 5);
        for (Integer[] integers : arrayList) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer[]> findSum(int[] nums, int target) {
        ArrayList<Integer[]> res = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int leftVal = nums[left];
            int rightVal = nums[right];
            int sum = leftVal + rightVal;
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                Integer[] integers = {leftVal, rightVal};
                res.add(integers);
                while (left < right && leftVal == nums[left]) {
                    left++;
                }
                while (left < right && rightVal == nums[right]) {
                    right--;
                }
            }
        }
        return res;
    }
}
