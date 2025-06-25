package basic.loop;

public class BenjaminBulbs {
    public static void main(String[] args) {
        int n = 100;

        System.out.println("ON:");

        for (int i = 1; i * i <= 100; i++) {
            System.out.println(i * i);
        }
    }
}
