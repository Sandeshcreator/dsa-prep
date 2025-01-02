package com.basic.loop;

import java.util.Scanner;

public class DigitsNumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        sc.close();

        int lastDigit = 0;
        int result = 0;

        while (userInput > 0) {
            lastDigit = userInput % 10;
            result = result * 10 + lastDigit;
            userInput = userInput / 10;
        }

        while (result > 0) {
            lastDigit = result % 10;
            System.out.println(lastDigit);
            result = result / 10;
        }

    }
}
