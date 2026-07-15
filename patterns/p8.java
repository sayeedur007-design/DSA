import java.util.Scanner;

public class p8 {

    public void p8(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        p8 obj = new p8();
        obj.p8(n);

        sc.close();
    }
}