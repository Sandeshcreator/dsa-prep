package com.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number till you want to give input a number :");
        int numberWant = scanner.nextInt();
        System.out.println("Now enter a number :" + numberWant + " times");

        int[] input = new int[numberWant];
        for (int i = 0; i < numberWant; i++) {
            input[i] = scanner.nextInt();
        }

        for (int nums : input) {
            boolean isPrime = true;
            for (int j = 2; j < numberWant; j += 2) {
                if (nums == 2) {
                    System.out.println("Prime Number");
                    continue;
                }
                if (nums % j != 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(nums + " is a Prime Number");
            } else {
                System.out.println(nums + " is Not a Prime Number");
            }

        }


    }
}
