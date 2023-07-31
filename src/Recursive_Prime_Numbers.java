import java.util.Scanner;

public class Recursive_Prime_Numbers {

    static boolean prime(int n, int i) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % i == 0) return false;
        if (Math.sqrt(n) < i) return true;
        return prime(n, i + 1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("Please enter a number to check if it's prime or not: ");
        n = input.nextInt();
        i = 2;
        System.out.print(prime(n, i));

    }
}
