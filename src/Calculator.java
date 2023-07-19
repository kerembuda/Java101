import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemin sayısını yazınız: 1=(+) 2=(-) 3=(/) 4=(x)");
        Scanner input3 = new Scanner(System.in);
        select = input3.nextInt();


        switch (select) {
            case 1:
                System.out.println("Cevap: " + (n1 + n2) );
                break;
            case 2:
                System.out.println("Cevap: " + (n1 - n2) );
                break;
            case 3:
                if (n2 == 0) {
                    System.out.println("Cevap= " + n1 + "Bir sayı sıfıra bölünemez");
                    break;
                }
                System.out.println("Cevap: " + (n1 / n2) );
                break;
            case 4:
                System.out.println("Cevap: " + (n1 * n2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!!!");
        }


    }
}