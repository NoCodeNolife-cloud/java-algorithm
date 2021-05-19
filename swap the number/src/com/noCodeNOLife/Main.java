package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        Number number=new Number(4,5);
        System.out.println("a = "+number.getX());
        System.out.println("b = "+number.getY());

        number.swap();
        System.out.println("a = "+number.getX());
        System.out.println("b = "+number.getY());
    }
}
