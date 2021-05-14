package com.noCodeNOLife;

import java.util.Vector;

public class NarcissisticNumber {

    private Vector<Integer>cnt;

    public NarcissisticNumber(){

        cnt=new Vector<>();
        for(int i=100;i<1000;++i){

            int tmpi=i;
            int sum=0;
            while(tmpi!=0){

                sum+=Math.pow(tmpi%10,3);
                tmpi/=10;
            }

            if(sum==i){

                cnt.add(sum);
            }
        }
    }

    public Vector<Integer> getNarcissisticNumber(){

        return cnt;
    }
}
