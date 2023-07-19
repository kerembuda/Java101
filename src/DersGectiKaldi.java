import java.util.Scanner;
public class DersGectiKaldi {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int valid = 0;
        int toplam = 0;
        double ortalama; // girdilerden sonra alınıyor.
        int passValue = 55;

        Scanner inputM = new Scanner(System.in);
        System.out.print("Lütfen matematik notunuzu giriniz: ");
        matematik = inputM.nextInt();

        Scanner inputF = new Scanner(System.in);
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = inputM.nextInt();

        Scanner inputT = new Scanner(System.in);
        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce = inputM.nextInt();

        Scanner inputK = new Scanner(System.in);
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = inputM.nextInt();

        Scanner inputMzk = new Scanner(System.in);
        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muzik = inputM.nextInt();

        if (matematik <= 100 && matematik >= 0) {
            toplam += matematik;
            valid++;
        }
        if (fizik <= 100 && fizik >= 0) {
            toplam += fizik;
            valid++;
        }
        if (turkce <= 100 && turkce >= 0) {
            toplam += turkce;
            valid++;
        }
        if (kimya <= 100 && kimya >= 0) {
            toplam += kimya;
            valid++;
        }
        if (muzik <= 100 && muzik >= 0) {
            toplam += muzik;
            valid++;
        }

        ortalama = toplam / valid;

        System.out.println(valid + " Geçerli not girdiniz, not ortalamanız: " + ortalama);
        System.out.println((ortalama >= passValue) ? "Sınıfı geçtiniz!!!" : "Sınıfta Kaldınız!! :(");


    }
}