import java.util.Objects;
import java.util.Scanner;
public class Daire_Alan_Cevre_Hesaplayici {
    public static void main(String[] args) {

        double r, alan, cevre, pi, a, dilim;
        pi = 3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();

        cevre = 2 * pi * r;
        alan = pi * r*r;

        System.out.println("Dairenin alanını mı çevresini mi öğrenmek istiyorsunuz?: (a) (c) ");
        Scanner input2 = new Scanner(System.in);
        String cevap = input2.nextLine();

        System.out.println(Objects.equals(cevap, "a") ? "Dairenin alanı: " + alan : "Dairenin cevresi: " + cevre);
        //System.out.println("Dari");

        System.out.println("a açısını girin: ");
        Scanner input3 = new Scanner(System.in);
        a = input3.nextDouble();
        dilim = (alan * a / 360);
        System.out.println("Daire diliminin alanı: " + dilim);


        }
    }
