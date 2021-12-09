package com.NoCodeNoLife;

import javax.swing.plaf.synth.SynthUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        permute(nums, track, res);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void permute(int[] nums, LinkedList<Integer> trace, LinkedList<LinkedList<Integer>> res) {
        if (trace.size() == nums.length) {
            // 创建副本
            LinkedList<Integer> temp=new LinkedList<>(trace);
            res.add(temp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (trace.contains(nums[i])) {
                continue;
            }
            // 选择
            trace.add(nums[i]);
            //
            permute(nums, trace, res);
            // 取消选择
            trace.removeLast();
        }
    }
}
