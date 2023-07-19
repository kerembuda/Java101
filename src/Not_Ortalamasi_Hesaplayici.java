import java.util.Scanner;
public class Not_Ortalamasi_Hesaplayici {
    public static void main(String[] args) {
        
        int turkce,matematik,kimya,fizik,beden,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Türkçe Notunuzu girin: ");
        turkce = input.nextInt();

        System.out.print("Matematik Notunuzu girin: ");
        matematik = input.nextInt();

        System.out.print("Kimya Notunuzu girin: ");
        kimya = input.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();

        System.out.print("Beden Eğitimi notunuzu girin: ");
        beden = input.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        muzik = input.nextInt();

        int toplam = (muzik + tarih + beden + fizik + kimya + matematik + turkce);
        double ortalama = (toplam / 7 );

        System.out.println("Not ortalamanız: " + ortalama);

        boolean durum = ortalama >= 60;
        String sonuc = durum ? "Geçti" : "Kaldı";
        System.out.println(sonuc);



        }
    }