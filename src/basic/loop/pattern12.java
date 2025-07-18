package basic.loop;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int numberOne = 0;
        int numberSec = 1;
        int resultNumb;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numberOne + "\t");
                resultNumb = numberOne + numberSec;
                numberOne = numberSec;
                numberSec = resultNumb;

            }
            System.out.println("\t");
        }
    }
}
