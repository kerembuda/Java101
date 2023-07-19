import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, tempNum;
        int basamakSayisi = 0;
        int basamakDegeri = 0;
        int basamakPower = 1;
        int result = 0;
        int resultWithoutPowers = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        tempNum = num;

        while (tempNum != 0) {
            tempNum /= 10;
            basamakSayisi++;
        }

        tempNum = num;
        while (tempNum != 0) {
            basamakDegeri = tempNum % 10;
            if (basamakDegeri != 0) {
                resultWithoutPowers += basamakDegeri;
            }
            for (int i = 1; i <= basamakSayisi; i++) {
                basamakPower *= basamakDegeri;
            }
            result += basamakPower;
            tempNum /= 10;
            basamakPower = 1;
        }
        if (result == num) {
            System.out.println(num + " sayısı bir Armstrong Sayı'dır.");
        } else {
            System.out.println(num + " sayısı bir Armstrong Sayı değildir.");
        }
        System.out.println("Sayının basamak değerlerinin toplamı = " + resultWithoutPowers);


        //burdan sonrası girilen sayıya kadar her sayıya bakmalı


        basamakSayisi = 0;
        basamakDegeri = 0;
        basamakPower = 1;
        int result2 = 0;
        int tempNum2 = 1;

        for (int l = 1; l <= num; l++) {
            tempNum2 = l;
            while (tempNum2 != 0) {
                tempNum2 /= 10;
                basamakSayisi++;
            }
            tempNum2 = l;
            while (tempNum2 != 0) {
                basamakDegeri = tempNum2 % 10;
                for (int k = 1; k <= basamakSayisi; k++) {
                    basamakPower *= basamakDegeri;
                }
                result2 += basamakPower;
                basamakPower = 1;
                tempNum2 /= 10;
            }
            if (result2 == l) {
                System.out.println(result2 + " sayısı bir Armstrong Sayı'dır.");
                result2 = 0;
                basamakSayisi = 0;
            } else {
                result2 = 0;
                basamakSayisi = 0;
            }
        }
    }
}