public class Prime_Numbers {
    public static void main(String[] args) {
        int maxRange = 100;
        boolean isPrime = true;
        System.out.println("Prime numbers from 1 to " + maxRange + ":");
        for (int i = 2; i <= maxRange; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}
