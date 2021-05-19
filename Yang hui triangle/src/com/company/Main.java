package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Vector<Integer>> res = YanghuiTriangle.getYanghuiTriangle(5);

        for (Vector<Integer> itemx : res) {

            for (Integer itemy : itemx) {
                System.out.print(itemy+" ");
            }
            System.out.println();
        }
    }
}
