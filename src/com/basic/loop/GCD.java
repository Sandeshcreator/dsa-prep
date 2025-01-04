package com.basic.loop;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userInputO = scn.nextInt();
        int userInputT = scn.nextInt();

        int ogInputO = userInputO;
        int ogInputT = userInputT;


        while (userInputO % userInputT != 0) {
            int rem = userInputO % userInputT;
            userInputO = userInputT;
            userInputT = rem;
        }

        int gcd = userInputT;

        int lcd = (ogInputO * ogInputT) / gcd;
        System.out.println(gcd);
        System.out.println(lcd);

    }
}
