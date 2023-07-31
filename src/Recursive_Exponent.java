import java.util.Scanner;
public class Recursive_Exponent {
    static int exp(int a, int b) {
        if (b == 0) return 1;
        return a * exp(a,b-1);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter base: ");
        a = inp.nextInt();
        System.out.print("Please enter power: ");
        b = inp.nextInt();
        System.out.println(a + "^" + b + " = " + exp(a,b));
    }
}
