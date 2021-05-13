package com.code;

public class Prime {

    private long value;

    public Prime(long _value) {

        value = _value;
    }

    public boolean circulationMethod() {

        for (int i = 2; i <= Math.sqrt(value); ++i) {

            if (value % i == 0) {

                return false;
            }
        }
        return true;
    }
}
