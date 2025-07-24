package basic.function;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println(tripletCheck(a, b, c));
    }

    private static boolean tripletCheck(int a, int b, int c) {
        int numb1 = a * a;
        int numb2 = b * b;
        int numb3 = c * c;

        if (numb1 + numb2 == numb3 || numb1 + numb3 == numb2 || numb2 + numb3 == numb1) {
            return true;
        }
        return false;
    }
}
