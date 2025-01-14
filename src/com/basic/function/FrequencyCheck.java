package com.basic.function;

import java.util.Scanner;

public class FrequencyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an input number: ");
        int input = scanner.nextInt();
        System.out.println("Enter a digit to check its frequency: ");
        int numberCheck = scanner.nextInt();
        System.out.println("Frequency of " + numberCheck + ": " + frequency(input, numberCheck));
    }

    public static int frequency(int input, int numberCheck) {
        int count = 0;
        while (input > 0) {
            int n = input % 10;  // store last one
            if (n == numberCheck) {
                count++;
            }
            input = input / 10;  // remove last digits from input
        }
        return count;
    }
}
