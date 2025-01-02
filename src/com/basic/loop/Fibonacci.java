package com.basic.loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number till u want");
        int end = sc.nextInt();
        int numb1 = 0;
        int numb2 = 1;
        int result = 0;
        System.out.print("Fibonacci sequence:" + numb1 + ", " + numb2);

        for (int i = 3; i <= end; i++) {
            result = numb1 + numb2;
            System.out.print(", " + result);

            numb1 = numb2;
            numb2 = result;


        }

    }
}
