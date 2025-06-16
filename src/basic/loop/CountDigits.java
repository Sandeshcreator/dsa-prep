package basic.loop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int n = userInput;
        int countDigi = 0;
        while (n != 0) {
            n = n / 10;
            countDigi++;
        }

        System.out.println(countDigi);
    }
}
