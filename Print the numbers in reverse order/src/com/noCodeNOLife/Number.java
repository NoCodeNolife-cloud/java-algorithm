package com.noCodeNOLife;

public class Number {

    private long value;

    public void setNumber(long value) {

        this.value = value;
    }

    public long getTraverseNumber(){

        long res=0;
        long tmpValue=value;
        while(tmpValue!=0){

            res=res*10+tmpValue%10;
            tmpValue/=10;
        }

        return res;
    }
}
