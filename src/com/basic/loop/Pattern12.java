package com.basic.loop;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;

        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("\t");
        }
    }
}
