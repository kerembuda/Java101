import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Number_Guess_Game {
    public static void main(String[] args) {
        Random secret_random = new Random();
        int secret_number = secret_random.nextInt(1,101);
        Scanner input = new Scanner(System.in);
        int user_guess = 0;
        int counter = 5;
        boolean isWin = false;
        int[] guesses = new int[counter];

        do {
            System.out.print("Guess the number! (1-100) :");
            user_guess = input.nextInt();

            if (user_guess == secret_number) {
                isWin = true;
                break;
            }

            if (!(user_guess < 100 && user_guess > 0)) {
                System.out.println("Please guess a number between 1 and 100!!!");
            } else if (user_guess < secret_number) {
                guesses[5-counter] = user_guess;
                System.out.println("The secret number is bigger than your guess!!!");
                counter--;
                if (counter > 1) {
                    System.out.println(counter + " tries left!!!");
                } else if (counter == 1) {
                    System.out.println("Last try...");
                }

            } else if (user_guess > secret_number) {
                System.out.println("The secret number is smaller than your guess!!!");
                guesses[5-counter] = user_guess;
                counter--;
                if (counter > 1) {
                    System.out.println(counter + " tries left!!!");
                } else if (counter == 1){
                    System.out.println("Last try...");
                }
            }
        } while (counter > 0);
        if (isWin) {
            System.out.println("You have won!!! GZ");
        } else {
            System.out.println("You have suffered major consequences... The dark lord absorbs your soul as you walk through hell...");
            System.out.println("And also, you lost. The number was " + secret_number + ". noob");
        }
        System.out.println("Your guesses were: " + Arrays.toString(guesses));
    }
}
