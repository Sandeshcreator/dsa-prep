package basic.function;

public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121;
        System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        int inputNumber = num;
        int result = 0;
        while (inputNumber > 0) {
            int rem = inputNumber % 10;
            result = result * 10 + rem;
            inputNumber = inputNumber / 10;
        }

        if (num == result) {
            return true;
        }
        return false;
    }
}
