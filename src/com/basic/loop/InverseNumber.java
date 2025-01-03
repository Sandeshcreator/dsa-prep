package com.basic.loop;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userInput = scn.nextInt();
        int pos = 1;
        int inv = 0;
        int n = userInput;
        while (n != 0) {
            int od = n % 10;
            int id = pos;
            int ip = od;

            inv = inv + id * (int)Math.pow(10, ip - 1);


            n = n / 10;
            pos++;
        }

        System.out.println(inv);

    }
}
