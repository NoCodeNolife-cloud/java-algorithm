package com.code;

import java.awt.*;

public class Case {

    private char lowCase;

    private char upperCase;

    public Case(char _lowCase) {

        if (checklowCase(_lowCase)) {

            lowCase = _lowCase;
            upperCase = (char) (lowCase - 'a' + 'A');
        } else {

            System.out.println("error!");
        }
    }

    public char getLowCase() {

        return lowCase;
    }

    public char getUpperCase() {

        return upperCase;
    }

    private boolean checklowCase(char _lowCase) {

        return _lowCase >= 'a' && _lowCase <= 'z';
    }
}
