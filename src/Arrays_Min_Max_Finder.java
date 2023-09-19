import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Min_Max_Finder {
    public static void main(String[] args) {
        int[] list = {1, 15, 25, 35, 40,-25, 3, 17, 98, 36, 67, 101, 64, 34, 2, 7, 853, 41};
        //totally random

        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);

        System.out.print("Please enter a number to check: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (userInput == i) {
                System.out.println("Closest small number is: " + );
            }

        }
    }
}

