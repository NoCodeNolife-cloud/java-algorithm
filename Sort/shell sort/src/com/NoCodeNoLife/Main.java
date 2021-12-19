package com.NoCodeNoLife;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[25];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 100);
        }
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void sort(int[] nums) {
        for (int step = nums.length / 2; step > 0; step /= 2) {
            for (int i = step; i < nums.length; i++) {
                int value = nums[i];
                int j;
                for (j = i - step; j >= 0 && value > nums[j]; j -= step) {
                    nums[j + step] = nums[j];
                }
                nums[j + step] = value;
            }
        }
    }
}
