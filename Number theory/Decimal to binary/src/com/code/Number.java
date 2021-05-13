package com.code;

public class Number {

    private long decimal;

    private long binary;

    public Number(long _decimal) {

        decimal = _decimal;
        String s = Long.toBinaryString(decimal);
        binary = Long.parseLong(s);
    }

    public long getBinary() {

        return binary;
    }
}
