import java.util.Scanner;

public class If_Odd_Total {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            if (num % 2 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);
        System.out.println("Sayıların toplamı: " + sum);
    }
}