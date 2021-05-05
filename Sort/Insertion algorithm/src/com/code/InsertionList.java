package com.code;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class InsertionList {

    private List list;

    private boolean hasSort;

    public InsertionList(int _size){

        list=new ArrayList();
        initialList(_size);
    }

    private void initialList(int _size){

        hasSort=false;

        Random random=new Random();

        for(int i=0;i<_size;++i){

            list.add(random.nextInt(1000));
        }
    }

    public void insertSort(){

        hasSort=true;

        for(int i=1;i<list.size();++i){

            int tmp=(int)list.get(i);

            int j;
            for(j=i-1;j>=0 && (int)list.get(j)>tmp;--j){

                list.set(j+1,list.get(j));
            }
            list.set(j+1,tmp);
        }
    }

    public void showList(){

        if(!hasSort){
            System.out.println("before sort:");
        }else{
            System.out.println("after sort:");
        }

        for(Object item:list) {

            int value=(int)item;
            System.out.printf(value+" ");
        }
        System.out.println();
    }
}
