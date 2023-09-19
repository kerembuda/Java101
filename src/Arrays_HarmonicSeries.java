public class Arrays_HarmonicSeries {
    public static void main(String[] args) {
        int[] numbers_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 72,15,};
        double sum = 0;
        double result = 0;
        for (int i = 0;i < numbers_array.length; i++) {
            sum += numbers_array[i];
            result += (1.0/numbers_array[i]);
        }

        System.out.println("Average: "+ sum /numbers_array.length);
        System.out.println("Harmonic series: " + result);
    }
}
