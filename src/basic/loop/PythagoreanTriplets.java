package basic.loop;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;

        if (a > b && a > c) {
            System.out.println(b * b + c * c == a * a ? "PythagoreanTriplets" : "not PythagoreanTriplets");
        } else if (b > a && b > c) {
            System.out.println(a * a + c * c == b * b ? "PythagoreanTriplets" : "not PythagoreanTriplets");
        } else {
            System.out.println(a * a + b * b == c * c ? "PythagoreanTriplets" : "not PythagoreanTriplets");
        }
    }
}
