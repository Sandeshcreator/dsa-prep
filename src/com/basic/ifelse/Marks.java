package com.basic.ifelse;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mark u got");
        int mark = sc.nextInt();

        markBasedMessage(mark);

    }

    private static void markBasedMessage(int mark) {
        if (mark <= 60) {
            System.out.println("below bar");
        } else if (mark <= 70) {
            System.out.println("meet expection");
        } else if (mark <= 80) {
            System.out.println("fair");
        } else {
            System.out.println("good");
        }
    }
}
