import java.util.Scanner;
public class KDV_Programi {
    public static void main (String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Para miktarını yazınız: ");

                double para = input.nextDouble();
                double kdv = para * 0.20;

                System.out.println("Paranız: " + para);
                System.out.println("Kdv Miktarı: " + kdv);
                System.out.println("Kdv'li genel toplam: " + (para + kdv));
    }
}
