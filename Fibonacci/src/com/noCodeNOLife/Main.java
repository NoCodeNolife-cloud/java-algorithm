package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(100);
        for (int i = 0; i < 24; ++i) {

            System.out.println("F(" + (i+1) + ")=" + fibonacci.get(i));
        }
    }
}
