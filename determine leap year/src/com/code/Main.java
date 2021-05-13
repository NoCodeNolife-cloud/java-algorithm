package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Year c_year = new Year(input.nextInt());

        if (c_year.cheakYear()) {

            System.out.println("the year is leap year");
        } else {

            System.out.println("the year is not leap year");
        }
    }
}
