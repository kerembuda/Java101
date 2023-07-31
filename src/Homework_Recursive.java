import java.util.Scanner;

public class Homework_Recursive {
    static void minus5(int a) {
        if (a >= -4) {
            System.out.println(a);
            minus5(a - 5);
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Please enter a number: ");
        a = input.nextInt();
        minus5(a);
    }

}
/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.

 Her çıkarma işlemi sırasında ekrana son değeri yazdırın.

 Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.

 Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */