package com.noCodeNOLife;

public class Number {

    private int x;
    private int y;

    public Number(int x,int y){

        this.x=x;
        this.y=y;
    }

    public void swap(){

        int tmp=x;
        x=y;
        y=tmp;
    }

    public int getX(){

        return x;
    }

    public int getY(){

        return y;
    }
}
