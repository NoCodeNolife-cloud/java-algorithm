package com.NoCodeNoLife;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        StringBuffer stringBuffer = new StringBuffer(s);
        int left = 0, right = 0;
        HashMap<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            cnt.put(t.charAt(i), 0);
        }
        while (right < s.length()) {
            if (cnt.containsKey(s.charAt(right))) {
                cnt.put(s.charAt(right), cnt.get(s.charAt(right)) + 1);
            }
            right++;
            boolean flag = true;
            for (Integer integer : cnt.values()) {
                if (integer == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                while (true) {
                    if (cnt.containsKey(s.charAt(left))) {
                        if (cnt.get(s.charAt(left)) > 1) {
                            cnt.put(s.charAt(left), cnt.get(s.charAt(left)) - 1);
                            left++;
                        } else {
                            StringBuffer stringBuffer1 = new StringBuffer();
                            for (int i = left; i < right; i++) {
                                stringBuffer1.append(s.charAt(i));
                            }
                            if (stringBuffer.length() > stringBuffer1.length()) {
                                stringBuffer = stringBuffer1;
                            }
                            break;
                        }
                    } else {
                        left++;
                    }
                }
            }
        }
        if (stringBuffer.length() == s.length()) {
            return "";
        }
        return stringBuffer.toString();
    }
}
