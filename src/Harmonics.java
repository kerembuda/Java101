import java.util.Scanner;
public class Harmonics {
    public static void main (String[] args){

        int n;
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number \"N\" :");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1.0/i);
        }
        System.out.println(result);


    }
}
