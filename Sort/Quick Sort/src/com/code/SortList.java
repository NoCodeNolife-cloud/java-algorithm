package com.code;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SortList {

    private List list;

    private boolean hasSort;

    public SortList(int _size) {

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

    public void quickSort(int _left,int _right){

        int tleft=_left;
        int tright=_right;
        int middle=(int)list.get((tleft+tright)/2);
        while(tleft<=tright){

            while((int)list.get(tleft)<middle){

                ++tleft;
            }
            while(middle<(int)list.get(tright)){

                --tright;
            }
            if(tleft<=tright){

                int tmp=(int)list.get(tleft);
                list.set(tleft,list.get(tright));
                list.set(tright,tmp);
                ++tleft;
                --tright;
            }
        }
        if(_left<tright){

            quickSort(_left,tleft-1);
        }
        if(tleft<_right){

            quickSort(tright+1,_right);
        }
    }

    public void showList() {

        if (!hasSort) {
            System.out.println("before sort");
        } else {
            System.out.println("after sort");
        }

        for (Object item : list) {

            int value=(int)item;
            System.out.printf(value+" ");
        }
        System.out.println();
    }
}
