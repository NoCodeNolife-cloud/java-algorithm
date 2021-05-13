package com.code;

public class Year {

    private int year;

    public Year(int _year) {

        if (_year < 0) {

            System.out.println("year error");
        } else {

            year = _year;
        }
    }

    public boolean cheakYear() {

        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
