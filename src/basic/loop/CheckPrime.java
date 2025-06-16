package basic.loop;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        for (int i = 2; i <= userInput; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            System.out.println(count >= 1 ? i + " not prime" : i + " prime");
        }
    }
}
