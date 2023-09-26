public class Arrays_Duplicate_Counter {
    public static void main(String[] args) {
        int[] list = {10, 15, 10, 20, 16, 10, 15, 20, 25, 50};
        //bence bi void fonksyon içinde sayıp bastırabiliriz her spesifik elemanı içine alan bir parametre,
        //sonra for loop ile her elemanı ayrıca sayabiliriz, içine if conditionu verebiliriz?
        // bu elemanı bi kere sorsduysan
        //sorma diye ama onu nasıl yapcaz
        System.out.println(appearanceCount(list,1));


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
