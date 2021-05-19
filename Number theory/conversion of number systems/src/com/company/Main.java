package com.company;

public class Main {

    public static void main(String[] args) {

        int number=50;
        int Binaries= Integer.parseInt(Integer.toBinaryString(number));
        System.out.println(Binaries);

        int Octobers= Integer.parseInt(Integer.toOctalString(number));
        System.out.println(Octobers);

        int Hexnumber= Integer.parseInt(Integer.toHexString(number));
        System.out.println(Hexnumber);
    }
}
