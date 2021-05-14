package com.noCodeNOLife;

public class Number {

    private long valueX;
    private long valueY;

    private long leastCommon;
    private long commonMultiple;

    public Number(long _valueX, long _valueY) {

        valueX = _valueX;
        valueY = _valueY;
        count();
    }

    private void count() {

        long tmpX = valueX;
        long tmpY = valueY;
        long r;

        do {
            r = tmpX % tmpY;
            tmpX = tmpY;
            tmpY = r;
        } while (r > 0);

        leastCommon = (valueX * valueY) / tmpX;
        commonMultiple = tmpX;
    }

    public long getLeastCommon(){

        return leastCommon;
    }

    public long getCommonMultiple(){

        return commonMultiple;
    }
}
