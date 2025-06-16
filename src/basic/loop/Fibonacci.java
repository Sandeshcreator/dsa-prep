package basic.loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else if (userInput == 1) {
            System.out.print("0");
        } else {
            int numb1 = 0, numb2 = 1;

            System.out.print(numb1 + " " + numb2);

            for (int i = 2; i < userInput; i++) {
                int next = numb1 + numb2;
                System.out.print(" " + next);
                numb1 = numb2;
                numb2 = next;
            }
        }
        }
    }

