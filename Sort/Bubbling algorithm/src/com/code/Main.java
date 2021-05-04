package com.code;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("the size of the list is: ");

        Scanner input=new Scanner(System.in);
        int size=input.nextInt();

        SortList list=new SortList(size);
        list.printElem();
        list.bubbleSort();
        list.printElem();
    }

}
