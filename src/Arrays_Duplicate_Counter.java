public class Arrays_Duplicate_Counter {
    public static void main(String[] args) {
        int[] list = {10, 15, 10, 20, 16, 10, 15, 20, 25, 50};
        int[] printed_list = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            if (!contains(printed_list, list[i])) {
                System.out.println(list[i] + " appeared " + appearanceCount(list, i) + " times in list.");
                printed_list[i] = list[i];
            }
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

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }
        return false;
    }

}
