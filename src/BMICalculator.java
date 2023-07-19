import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double boy, kilo, bmi;

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        Scanner input = new Scanner(System.in);
        boy = input.nextDouble();

        System.out.print("Kilonuzu KG cinsinden giriniz: ");
        Scanner input2 = new Scanner(System.in);
        kilo = input2.nextDouble();

        bmi = kilo / (boy * boy);
        System.out.println("Vücut kitle İndeksiniz: " + bmi);









        }
    }
