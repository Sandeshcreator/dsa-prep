package com.basic.loop;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            boolean flag = ((b * b) + (c * c)) == (a * a);
            System.out.println(flag);

        } else if (b > a && b > c) {
            boolean flag = ((b * b) + (c * c)) == (a * a);
            System.out.println(flag);
        } else {
            boolean flag = ((b * b) + (c * c)) == (a * a);
            System.out.println(flag);
        }
    }
}
