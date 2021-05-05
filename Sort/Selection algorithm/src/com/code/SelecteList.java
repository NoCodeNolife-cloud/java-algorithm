package com.code;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SelecteList {

    private List list;

    private boolean hasSort;

    public SelecteList(int _size) {

        list = new ArrayList();
        initialList(_size);
    }

    private void initialList(int _size) {

        hasSort = false;

        Random random = new Random();

        for (int i = 0; i < _size; ++i) {

            list.add(random.nextInt(1000));
        }
    }

    public void sortList() {

        hasSort = true;

        for (int i = 0; i < list.size(); ++i) {

            int maxindex = i;
            for (int j = i + 1; j < list.size(); ++j) {

                if ((int) list.get(maxindex) < (int) list.get(j)) {

                    maxindex = j;
                }
            }
            int tmp = (int) list.get(i);
            list.set(i, list.get(maxindex));
            list.set(maxindex, tmp);
        }
    }

    public void showList() {

        if (!hasSort) {
            System.out.println("before sort");
        } else {
            System.out.println("after sort");
        }

        for (Object item : list) {

            int value = (int) item;
            System.out.printf(value + " ");
        }
        System.out.println();
    }
}
