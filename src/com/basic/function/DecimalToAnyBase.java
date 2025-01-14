package com.basic.function;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = anyBase(a, b);
        System.out.println(result);
    }

    private static int anyBase(int a, int b) {
        int result = 0;
        int p = 1;
        while (a > 0) {
            int rem = a % b;
            a = a / b;
            result += rem * p;
            p = p * 10;
        }
        return result;
    }

}
