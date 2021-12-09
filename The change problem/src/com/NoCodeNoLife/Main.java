package com.NoCodeNoLife;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Integer[] money = {1, 2, 5};
        LinkedList<Integer> coins = new LinkedList<>();
        Collections.addAll(coins, money);
        for (int i = 0; i < 20; i++) {
            System.out.println(recursion(coins, i));
        }
    }

    public static Integer recursion(LinkedList<Integer> coins, int target) {
        Collections.sort(coins, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                }
                if (o1 == o2) {
                    return 0;
                }
                return 1;
            }
        });
        int res = 0;
        for (Integer integer : coins) {
            res += target / integer;
            target %= integer;
            if (target == 0) {
                break;
            }
        }
        return res;
    }
}
