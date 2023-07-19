import java.util.Scanner;

public class Plane_Ticket_Price_with_Discounts {
    public static void main(String[] args) {
        int km, age, type;
        double feePerKM = 0.10;
        double normalFee, childFee, youngFee, oldFee, finalPrice;
        double childDiscount = 0.50;
        double youngDiscount = 0.10;
        double oldDiscount =  0.30;
        double twoWayDiscount = 0.20;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz: (1) Tek Yön, (2) Gidiş-Dönüş: ");
        type = input.nextInt();

        if ((age <= 0 || km <= 0) || (type < 1 || type > 2)) {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız!!!");
            System.exit(0);
        }

        normalFee = km * feePerKM;
        childFee = normalFee - (normalFee * childDiscount);
        youngFee = normalFee - (normalFee * youngDiscount);
        oldFee = normalFee - (normalFee * oldDiscount);

        if (age < 12) {
            finalPrice = childFee;
        } else if (age >= 12 && age <= 24) {
            finalPrice = youngFee;
        } else if (age > 24 && age <65) {
            finalPrice = normalFee;
        } else {
            finalPrice = oldFee;
        }

        switch (type) {
            case 1:
                System.out.println("Bilet fiyatınız: " + finalPrice + "TL");
                break;
            case 2:
                finalPrice = finalPrice - (finalPrice * twoWayDiscount);
                System.out.println("Bilet fiyatınız: " + finalPrice + "TL");
                break;
        }


    }
}