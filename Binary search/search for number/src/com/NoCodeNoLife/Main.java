package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 7, 8, 9, 15, 25, 75, 94};
        test(nums, 35);
        test(nums, 25);
        // border test
        test(nums, 1);
        test(nums, 94);
    }

    public static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middleIndex = (left + right) / 2;
            int middleValue = nums[middleIndex];
            if (middleValue < target) {
                left = middleIndex + 1;
            } else if (middleValue == target) {
                return true;
            } else {
                right = middleIndex - 1;
            }
        }
        return false;
    }

    public static int binarySearchForIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middleIndex = (left + right) / 2;
            int middleValue = nums[middleIndex];
            if (middleValue < target) {
                left = middleIndex + 1;
            } else if (middleValue == target) {
                return middleIndex;
            } else {
                right = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void test(int[] nums, int target) {
        if (binarySearch(nums, target)) {
            System.out.println("find " + target + " index is " + binarySearchForIndex(nums, target));
        } else {
            System.out.println("not found " + target);
        }
    }
}
