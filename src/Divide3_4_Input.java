import java.util.Scanner;
public class Divide3_4_Input {
    public static void main(String[] args) {
        int num;
        double sum = 0;
        double howmany = 0;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        num = input.nextInt();
        while (num < 3) {
            System.out.print("Sayı 3 ten küçük olamaz! Sayıyı tekrar giriniz: ");
            num = input.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) || (i % 4 == 0)) {
                sum += i;
                howmany++;
            }
        }
        sonuc = sum / howmany;
        System.out.println("3'e veya 4'e tam bölünebilen sayıların ortalaması : " + sonuc);
    }
}