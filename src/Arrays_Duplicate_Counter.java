public class Arrays_Duplicate_Counter {
    public static void main(String[] args) {
        int[] list = {10, 15, 10, 20, 16, 10, 15, 20, 25, 50};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] +" appeared "+appearanceCount(list, i) + " times in list.");
        }
    }
    public static int appearanceCount(int[] arr, int index) {
        int counter = 0;
        int j = arr[index];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                counter++;
            }
        }
        return counter;
    }

}
