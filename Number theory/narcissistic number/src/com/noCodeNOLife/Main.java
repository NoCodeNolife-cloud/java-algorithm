package com.noCodeNOLife;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        NarcissisticNumber narcissisticNumber = new NarcissisticNumber();
        Vector<Integer> res=narcissisticNumber.getNarcissisticNumber();
        for(Integer item:res){

            System.out.println(item);
        }
    }
}
