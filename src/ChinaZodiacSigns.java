import java.util.Scanner;
public class ChinaZodiacSigns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, formula, remainder;
        formula = 12;
        String zodiac;
        boolean isError = false;

        System.out.print("Doğum yılınızı giriniz:");
        age = input.nextInt();

        remainder = age % formula;

        if (age < 0 || age >= 2023) {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız!!!");
            System.exit(0);
        }
        switch (remainder) {
            case 0:
                zodiac = "Maymun";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 1:
                zodiac = "Horoz";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 2:
                zodiac = "Köpek";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 3:
                zodiac = "Domuz";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 4:
                zodiac = "Fare";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 5:
                zodiac = "Öküz";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 6:
                zodiac = "Kaplan";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 7:
                zodiac = "Tavşan";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 8:
                zodiac = "Ejderha";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 9:
                zodiac = "Yılan";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 10:
                zodiac = "At";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
            case 11:
                zodiac = "Koyun";
                System.out.println("Çin zodyağı burcunuz: " + zodiac);
                break;
        }
    }
}