package com.basic.array;

public class AddDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            int rem = 0;
            while (num > 0) {
                rem += num % 10;
                num = num / 10;
            }
            num = rem;
        }
        return num;

    }
}
