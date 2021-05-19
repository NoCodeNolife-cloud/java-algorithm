package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        int nums[]={4,5,6,1,2,3};
        Number number=new Number();
        number.nextPermutation(nums);
        for(int item:nums){

            System.out.printf(item+" ");
        }
        System.out.println();
    }
}
