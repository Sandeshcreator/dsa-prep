package basic.loop;

public class Pattern3 {
    public static void main(String[] args) {
        int space = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
