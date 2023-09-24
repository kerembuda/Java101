import java.util.Arrays;

public class Arrays_Find_Duplicate_Even_Num {
    public static void main(String[] args) {

        int[] list = {1, 5, 6, 8, 3, 4, 1, 5, 6, 3, 7, 4, 3, 6, 32, 2, 2};
        //random
        int[] listDuplicates = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] == list[i]) {
                    if (list[i] % 2 == 0 && !contains(listDuplicates, list[i])) {
                        listDuplicates[i] = list[i];
                    }
                }
            }
        }
        System.out.println("The even duplicates found in list are like below:");
        printArr(listDuplicates);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
