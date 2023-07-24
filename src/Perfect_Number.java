import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println("This number is perfect! Like you <3");
        } else {
            System.out.println("This number is not perfect :(");
        }
    }
}


