package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 在数组中找寻等于target的三个值
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ArrayList<ArrayList<Integer>> res = threeSumTarget(nums, 5);
        for (ArrayList<Integer> arrayList : res) {
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> twoSumEqual(int[] nums, int begin, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int left = begin;
        int right = nums.length - 1;
        while (left < right) {
            int left_val = nums[left];
            int right_val = nums[right];
            int sum = left_val + right_val;
            if (sum < target) {
                while (nums[left] == left_val) {
                    left++;
                }
            } else if (sum > target) {
                while (nums[right] == right_val) {
                    right--;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left_val);
                temp.add(right_val);
                res.add(temp);
                while (nums[left] == left_val) {
                    left++;
                }
                while (nums[right] == right_val) {
                    right--;
                }
            }
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> threeSumTarget(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<ArrayList<Integer>> temp = twoSumEqual(nums, i + 1, target);
            for (ArrayList<Integer> arrayList : temp) {
                arrayList.add(0, nums[i]);
                res.add(arrayList);
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }
}
