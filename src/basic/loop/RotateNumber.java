package basic.loop;

public class RotateNumber {
    public static void main(String[] args) {
        int number = 123456;
        int rotationNumb = 2;

        int temp = number;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        rotationNumb = rotationNumb % digits;

        while (rotationNumb > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            number = lastDigit * (int) Math.pow(10, digits - 1) + number;
            rotationNumb--;
        }

        System.out.println("Rotated number: " + number);
    }
}
