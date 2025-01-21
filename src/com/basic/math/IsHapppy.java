package com.basic.math;

public class IsHapppy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int num) {
        while (num >= 10) {
            int rem = 0;
            int result = 0;
            while (num > 0) {
                rem = num % 10;
                result += rem * rem;
                num = num / 10;
            }
            num = result;
        }
        if (num == 1 || num == 7) {
            return true;
        }
        return false;
    }
}
