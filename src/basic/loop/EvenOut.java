package basic.loop;

public class EvenOut {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Go out ");
                count++;
            }
        }

        System.out.println("Total number of days Kunal can go out in August: " + count);
    }
}
