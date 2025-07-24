package basic.function;

public class PrimeCheck {
    public static void main(String[] args) {
        int input = 5;
        if (input > 1) {
            primeNumber(input);
        }

    }

    private static void primeNumber(int input) {
        int count = 0;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        System.out.println(count >= 1 ? "not prime" : "prime");
    }
}
