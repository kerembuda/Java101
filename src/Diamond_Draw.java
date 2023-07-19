import java.util.Scanner;

public class Diamond_Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter diamond max width: ");
        int n = input.nextInt();
        int spaceCount;

        for (int i = 1; i <= n; i++) {
            for (spaceCount = (n - 1 - i); spaceCount >= 0; spaceCount--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= n -1; i++) {
            for (spaceCount = 1; spaceCount <= i; spaceCount++) {
                System.out.print(" ");
            }
            //yıldızlar
            for (int k = 1; k <= (2*n -1) - 2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
