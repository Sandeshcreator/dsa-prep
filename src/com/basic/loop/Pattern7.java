package com.basic.loop;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
