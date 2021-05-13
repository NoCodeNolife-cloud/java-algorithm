package com.code;

public class Sequence {

    private double A1;
    private double An;
    private int n;
    private double S;

    public Sequence(double _a1, double _an, int _n) {

        S = _n * (_a1 + _an) / 2.0;
    }

    public double getSquare(){
        return S;
    }
}
