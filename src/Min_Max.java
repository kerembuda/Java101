import java.util.Scanner;
public class Min_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCount, num;
        int min = 0;
        int max = 0;

        System.out.print("How many numbers are you going to add? :");
        numCount = input.nextInt();

        for (int i = 1; i <= numCount; i++) {
            System.out.print("Enter " + i + ". number: ");
            num = input.nextInt();
            if (i == 1) {
                min = num;
                max = num;
            }

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;

            }
        }
        System.out.println("Minimum number is: " + min +"\nMaximum number is: " + max);
    }
}
