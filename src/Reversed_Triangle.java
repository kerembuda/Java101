import java.util.Scanner;
public class Reversed_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height, lineCount = 1;
        int starCount, spaceCount;

        System.out.print("Please enter desired height for your reversed triangle: ");
        height = input.nextInt();
        starCount = height * 2 - 1;
        spaceCount = 0;
        System.out.println("Here you go");
        while (lineCount <= height) {
            for (int k= 1; k <= spaceCount; k++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= starCount; i++) {
                System.out.print("*");
            }
            System.out.println();
            starCount -= 2;
            lineCount++;
            spaceCount++;
        }
    }
}
