package basic.loop;

public class Pattern13 {
    public static void main(String[] args) {
        int input = 6;

        for (int i = 0; i < input; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj+ "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println(" ");
        }
    }
}
