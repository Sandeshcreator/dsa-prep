package basic.loop;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int outNumber = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(outNumber + "\t");
                outNumber++;
            }
            System.out.println("\t");
        }
    }
}
