package com.basic.loop;

import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number that must be greater than 2");
        int start = sc.nextInt();

        System.out.println("Enter a number want to end");
        int end = sc.nextInt();

        checkAllPrime(start, end);

    }

    private static void checkAllPrime(int start, int end) {
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 2; j * j <= end; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

}
