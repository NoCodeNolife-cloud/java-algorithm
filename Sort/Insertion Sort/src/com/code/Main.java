package com.code;

public class Main {

    public static void main(String[] args) {

        InsertionList list=new InsertionList(100);
        list.showList();
        list.insertSort();
        list.showList();
    }
}
