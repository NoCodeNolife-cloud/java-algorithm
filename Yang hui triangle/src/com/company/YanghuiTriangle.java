package com.company;

import java.util.Vector;

public class YanghuiTriangle {

    public static Vector<Vector<Integer>> getYanghuiTriangle(int size) {

        Vector<Vector<Integer>> res = new Vector<>(size + 1);

        if (size >= 1) {

            Vector<Integer> tmp = new Vector<>();
            tmp.add(1);
            res.add(tmp);

            if (size >= 2) {

                tmp = new Vector<>();
                tmp.add(1);
                tmp.add(1);
                res.add(tmp);

                if(size>=3) {

                    for (int i = 2; i < size; ++i) {

                        tmp = new Vector<>();// tmp重新分配空间

                        tmp.add(1);
                        for (int j = 1; j <i;++j){

                            tmp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                        }
                        tmp.add(1);

                        res.add(tmp);
                    }
                }
            }

            return res;

        } else {

            System.out.println("input error!");
            return null;
        }
    }
}
