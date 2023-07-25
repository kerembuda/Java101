import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fsLength;
        long sum = 0;
        long firstNum, secondNum;

        System.out.print("Enter Fibonacci Sequence length: ");
        fsLength = input.nextInt();

        firstNum = 0;
        secondNum = firstNum + 1;
        int loopCount = 1;

        while (loopCount < fsLength) {
            if (loopCount == 1) {
                System.out.print(firstNum + " " + secondNum);
            }
            sum = firstNum + secondNum;
            System.out.print(" " + sum);
            firstNum = secondNum;
            secondNum = sum;
            loopCount++;
        }
    }
}
