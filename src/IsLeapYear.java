import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, remainder;
        boolean isLeap = false;

        System.out.print("Yıl giriniz: ");
        year = input.nextInt();
        remainder = year % 4;

        if (remainder == 0) {
            isLeap = true;
        }
        System.out.println(isLeap ? year + " Yılı artık yıldır." : year + " Yılı artık yıl değildir.");

    }
}