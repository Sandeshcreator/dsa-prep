package com.basic.loop;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 10;
        //row
        for (int i = 1; i <= n; i++) {
            //for space
            for (int j = 1; j < i; j++) {
                System.out.print("\t");
            }
            //star
            for (int j = i; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
