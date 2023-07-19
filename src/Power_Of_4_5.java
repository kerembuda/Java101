import java.util.Scanner;

public class Power_Of_4_5 {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int inputNumber;
        int i = 1;
        int j = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        inputNumber = input.nextInt();
        System.out.print("4 ün kuvvetleri: ");
        while (inputNumber > i) {
            System.out.print(i + " ");
            i *= 4;
        }
        System.out.println();
        System.out.print("5 in kuvvetleri: ");
        while (inputNumber > j) {
            System.out.print(j + " ");
            j *= 5;
        }

    }
}