import java.util.Scanner;
public class Palindromic_Numbers {
    static boolean isPalindrom(int number) {
        // basamakları ayırıp başa alan fonksiyon
        int tempNumber = number, reversedNumber = 0, lastDigit;
        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            tempNumber /= 10;
        }
        if (number == reversedNumber) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want to check: ");
        int num = input.nextInt();
        System.out.println(isPalindrom(num) ? num + " is a palindrome number." : (num + " is not a palindrome number."));
    }
}
