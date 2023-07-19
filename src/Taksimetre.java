import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        double km, minucret, acilisucret, kmbasiücret, sonucret;
        minucret = 20;
        acilisucret = 10;
        kmbasiücret = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km yol gitmek istediğinizi girin: ");
        km = input.nextDouble();
        sonucret = acilisucret + (km * kmbasiücret);
        if (sonucret < minucret ) {
            sonucret = minucret;
        }
        System.out.println("Yolculuğunuz " + sonucret + "TL tutacaktır.");

    }
}
            /*
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
            */