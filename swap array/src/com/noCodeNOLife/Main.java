package com.noCodeNOLife;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // declare vector
        Vector<Integer> vec = new Vector<>();
        vec.setSize(10);
        for (int i = 0; i < vec.size(); ++i) {

            vec.set(i, i);
        }

        // print vector
        for (Integer item : vec) {

            System.out.print(item + " ");
        }
        System.out.println();

        // swap vector
        swap(vec, 2, 5);

        // print vector
        for (Integer item : vec) {

            System.out.print(item + " ");
        }
        System.out.println();
    }

    static void swap(Vector<Integer> vec, int i, int j) {

        Integer tmp = vec.get(i);
        vec.set(i, vec.get(j));
        vec.set(j, tmp);
    }
}
