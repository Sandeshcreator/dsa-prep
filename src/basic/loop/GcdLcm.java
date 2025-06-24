package basic.loop;

public class GcdLcm {
    public static void main(String[] args) {
        int n1 = 36;
        int n2 = 24;

        int nn1 = n1;
        int nn2 = n2;

        while (n1 % n2 != 0) {
            n2 = n1 % n2;
            n1 = n2;
        }
        System.out.println("gcd: " + n1);
        System.out.println("lcm:  " + (nn1 * nn2) / n1);

    }
}
