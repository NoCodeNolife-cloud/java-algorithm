package com.code;

public class Main {

    public static void main(String[] args) {

        SortList list=new SortList(100);
        list.showList();
        list.quickSort(0,99);
        list.showList();
    }
}
