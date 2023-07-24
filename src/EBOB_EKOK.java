import java.util.Scanner;
public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, tempNum;
        int EBOB = 0;
        int EKOK = 0;

        System.out.print("N1 sayısını girin: ");
        n1 = input.nextInt();
        System.out.print("N2 sayısını girin: ");
        n2 = input.nextInt();

        if (n2 < n1) {
            tempNum = n1;
            n1 = n2;
            n2 = tempNum;
        }

        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                EBOB = i;
            }
            i++;
        }
        EKOK = (n1*n2) / EBOB;
        System.out.println("Sayıların EBOB'u: "+EBOB);
        System.out.println("Sayıların EKOK'u: "+EKOK);
    }
}


