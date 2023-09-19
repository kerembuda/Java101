import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Min_Max_Finder {
    public static void main(String[] args) {
        int[] list = {1, 15, 25, 35, 40, -25, 3, 17, 98, 36, 67, 101, 64, 34, 2, 7, 853, 41};
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
        //System.out.println(min);
        //System.out.println(max);

        System.out.print("Please enter a number to check: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        Arrays.sort(list);
        System.out.println("This is the list (sorted): " + Arrays.toString(list));

        if (userInput > max) {
            System.out.println("Closest big number is: " + max + ", this is the biggest number in the list.");
            System.exit(0);
        }
        if (userInput < min) {
            System.out.println("Closest small number is: " + min + ", this is the smallest number in the list.");
            System.exit(0);
        }


        for (int i = 0; i < list.length; i++) {
            //if userinput exists
            if (userInput == list[i]) {
                System.out.println("Closest small number is: " + list[i - 1]);
                System.out.println("Closest big number is: " + list[i + 1]);
                break;
            }
        }

        //büyükten küçüğe kontrol etcez daha büyük mü diye büyük mü diye bakcaz

        for (int i = 0; i < list.length; i++) {
            if (userInput < list[i]) {
                System.out.println("Closest small number is: " + list[i - 1]);
                System.out.println("Closest big number is: " + list[i]);
                break;
            }
        }


    }
}

