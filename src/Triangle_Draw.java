import java.util.Scanner;
public class Triangle_Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter triangle height: ");
        int n = input.nextInt();
        int spaceCount;
        int starCount = 1;

        for (int i = 1; i <= n; i++) {

            for (spaceCount = (n - 1 - i); spaceCount >= 0; spaceCount--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

