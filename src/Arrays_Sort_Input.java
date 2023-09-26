import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Sort_Input {
    public static void main(String[] args) {

        //take array length from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int[] list = new int[input.nextInt()];

        //take numbers from user
        for (int i = 0; i < list.length; i++) {
            System.out.print("Please enter " + (i + 1) + ". number: ");
            list[i] = input.nextInt();
        }

        int[] sorted_list = list.clone();

        for (int i = 0; i < sorted_list.length; i++) {
            for (int j = i + 1; j < sorted_list.length; j++) {
                int temp = 0;
                if (sorted_list[i] > sorted_list[j]) {
                    temp = sorted_list[i];
                    sorted_list[i] = sorted_list[j];
                    sorted_list[j] = temp;
                }
            }
        }
        System.out.println("Original list: " + Arrays.toString(list));
        System.out.println("Sorted list: " + Arrays.toString(sorted_list));
    }
}

