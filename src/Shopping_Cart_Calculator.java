import java.util.Scanner;
public class Shopping_Cart_Calculator {
    public static void main(String[] args) {
        double Armut = 40.14, Elma = 30.67, Domates = 25.11, Muz = 45.95, Patlican = 25;
        double aa, ee, dd, mm, pp, toplam;

        System.out.print("Kaç kilo armut almak istersiniz? : ");
        Scanner armud = new Scanner(System.in);
        aa = armud.nextDouble() * Armut;

        System.out.print("Kaç kilo elma almak istersiniz? : ");
        Scanner alma = new Scanner(System.in);
        ee = alma.nextDouble() * Elma;

        System.out.print("Kaç kilo domates almak istersiniz? : ");
        Scanner domat = new Scanner(System.in);
        dd = domat.nextDouble() * Domates;

        System.out.print("Kaç kilo muz almak istersiniz? : ");
        Scanner zum = new Scanner(System.in);
        mm = zum.nextDouble() * Muz;

        System.out.print("Kaç kilo patlıcan almak istersiniz? : ");
        Scanner patlicanko = new Scanner(System.in);
        pp = patlicanko.nextDouble() * Patlican;

        toplam = aa + ee + dd + mm + pp;

        System.out.println("Ödemeniz gereken toplam tutar: " + toplam);













    }
}