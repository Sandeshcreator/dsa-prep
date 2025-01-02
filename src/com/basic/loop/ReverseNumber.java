package com.basic.loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        sc.close();
        int result = 0;

        while (userInput != 0) {
            result = userInput % 10;
            System.out.print(result);
            userInput = userInput / 10;

        }

    }
}
