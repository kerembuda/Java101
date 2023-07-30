import java.util.Scanner;

public class Complex_Calculator {


    static int sum(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static float divide(float a, float b) {
        return a / b;
    }
    static int exponent(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) result *= a;
        return result;
    }
    static int factorial(int a) {
        int result = 1;
        for (int i = 1;i <= a; i++) result *= i;
        return result;
    }
    static int modulus(int a, int b) {
        return a % b;
    }


    public static void main(String[] args) {
        int a = 0, b = 0;
        int userSelection;
        Scanner input = new Scanner(System.in);
        String userMenu =
                "1 - Sum\n" +
                        "2 - Subtract\n" +
                        "3 - Multiply\n" +
                        "4 - Divide\n" +
                        "5 - Exponent\n" +
                        "6 - Factorial\n" +
                        "7 - Modulus\n" +
                        "8 - Rectangular Area and Perimeter\n" +
                        "0 - Exit \n" +
                        "Please choose an operation: ";

        do {
            System.out.print(userMenu);
            userSelection = input.nextInt();
            if (userSelection == 0) break;

            while (userSelection < 0 || userSelection > 8) {
                System.out.print("Invalid entry, please try again!\n");
                System.out.print(userMenu);
                userSelection = input.nextInt();
            }

            if (userSelection == 6) {
                System.out.print("Please enter number: ");
                a = input.nextInt();
            } else {
                System.out.print("Please enter first number: ");
                a = input.nextInt();
                System.out.print("Please enter second number: ");
                b = input.nextInt();
            }


            switch (userSelection) {
                case 1:
                    System.out.println(a + " + " + b + " = " + sum(a, b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + subtract(a, b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + multiply(a, b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by 0.");
                        break;
                    }
                    float A = a, B = b;
                    System.out.println(a + " / " + b + " = " + divide(A, B));
                    break;
                case 5:
                    System.out.println(a + " ^ " + b + " = " + exponent(a, b));
                    break;
                case 6:
                    System.out.println(a + "! = " + factorial(a));
                    break;
                case 7:
                    System.out.println(a + " % " + b + "=" + modulus(a, b));
                    break;
                case 8:
                    System.out.println("Rectangular area = " + multiply(a, b));
                    System.out.println("Rectangular perimeter = " + 2 * sum(a, b));
                case 0:
                    System.exit(0);
                    break;
            }
        } while (userSelection != 0);
    }
}

/*
1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
 */