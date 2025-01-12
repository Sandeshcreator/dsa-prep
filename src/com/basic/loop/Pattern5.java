package com.basic.loop;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 3;
        //row
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            //star
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        //reverse star
        for (int i = n; i >= 1; i--) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            //star
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
