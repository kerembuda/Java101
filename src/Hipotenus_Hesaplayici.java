import java.util.Scanner;
public class Hipotenus_Hesaplayici {
    public static void main(String[] args) {
        int a, b;
        double c,cevre,alan, u;

        System.out.print("Birinci kenar uzunluğunu girin: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        System.out.print("İkinci kenar uzunluğunu girin: ");
        Scanner input2 = new Scanner(System.in);
        b = input2.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs uzunluğu: " + c);

        u = (a + b + c) / 2;
        cevre = 2.0 * u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}