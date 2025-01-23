package com.basic.math;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        if (x > 0) {
            int c = 0;
            while (x > 0) {
                int digit = x % 10;
                x = x / 10;
                if (c > (Integer.MAX_VALUE / 10) ||
                        (c == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    return 0;
                }
                c = (c * 10) + digit;
            }
            return c;
        }
        if (x < 0) {
            int c = 0;
            x = Math.abs(x);
            while (x > 0) {
                int digit = x % 10;
                x = x / 10;
                if (c > (Integer.MAX_VALUE / 10) ||
                        (c == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    return 0;
                }
                c = (c * 10) + digit;
            }
            return -c;
        }
        return 0;
    }
}
