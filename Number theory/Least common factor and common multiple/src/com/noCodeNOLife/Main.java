package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        Number number=new Number(760,612);
        System.out.println("760和612的最大公约数是"+number.getCommonMultiple());
        System.out.println("760和612的最小公倍数是"+number.getLeastCommon());
    }
}
