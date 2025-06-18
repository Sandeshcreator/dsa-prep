package basic.loop;

public class InverseNumber {
    public static void main(String[] args) {
        int number = 15234;
        int n = number;

        int position = 1;
        int inverted = 0;
        while (n != 0) {
            int digits = n % 10;
            int nextPosition = digits;

            inverted = inverted + position * (int) Math.pow(10, digits - 1);
            n = n / 10;
            position++;
        }
        System.out.println(inverted);


    }
}

