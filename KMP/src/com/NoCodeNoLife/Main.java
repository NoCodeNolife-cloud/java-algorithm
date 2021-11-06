package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        String s = "abcab";
        String t = "bc";
        System.out.println(KMP.kmpMatch(s, t));
    }
}
