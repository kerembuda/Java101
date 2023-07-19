import java.util.Scanner;
public class Basic_Sort_a_b_c {
    public static void main(String[] args) {

        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("A Sayısı: ");
        a = input.nextInt();

        System.out.print("B Sayısı: ");
        b = input.nextInt();

        System.out.print("C Sayısı: ");
        c = input.nextInt();


        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            }else if (c < b) {
                System.out.println("a < c < b");
            }
        }
        else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c");
            }else if (c < a) {
                System.out.println("b < c < a");
            }
        }
        else {
            if (c < b) {
                System.out.println("c < b < a");
            }else if (b < c) {
                System.out.println("c < a < b");
            }
        }

    }
}