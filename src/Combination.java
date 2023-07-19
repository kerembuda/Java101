import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("N sayısını girin: ");
            n = input.nextInt();
            System.out.print("R sayısını girin: ");
            r = input.nextInt();
            if (r >= n || n <= 0) {
                System.out.println("Yanlış giriş yaptınız, tekrar deneyiniz.");
            }
        }
        while (r >= n || n <= 0);

        // C(n,r) = n! / (r! * (n-r)!)

        int nFact = 1;
        int rFact = 1;
        int n_rFact = 1;

        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            n_rFact *= i;
        }

        int combination = nFact / (rFact * n_rFact);

        System.out.println("C(N, R) = " + combination);
    }
}


