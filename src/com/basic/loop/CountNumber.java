package com.basic.loop;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int count = 0;
        while (userInput != 0) {
            count++;
            userInput = userInput / 10;
        }
        System.out.println(count);

    }
}
