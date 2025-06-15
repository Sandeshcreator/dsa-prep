package basic.condition;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int percentage= scanner.nextInt();

        if (percentage>90){
            System.out.println("A+");
        } else if (percentage>80) {
            System.out.println("A");
        } else if (percentage>70) {
            System.out.println("B+");
        }else if (percentage>60) {
            System.out.println("B");
        }else if (percentage>50) {
            System.out.println("C+");
        }else if (percentage>40) {
            System.out.println("C");
        }else {
            System.out.println("Fail");
        }
    }
}
