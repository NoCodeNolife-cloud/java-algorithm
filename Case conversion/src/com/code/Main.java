package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        char char_lowCase = str.charAt(0);
        Case c_case = new Case(char_lowCase);
        System.out.println("Сд: " + c_case.getLowCase());
        System.out.println("��д: " + c_case.getUpperCase());
    }
}
