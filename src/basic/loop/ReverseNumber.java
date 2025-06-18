package basic.loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int rem = userInput;
        int lastOne;
        while (rem > 0) {
            lastOne = rem % 10;
            rem = rem / 10;
            System.out.println(lastOne);
        }
    }
}
