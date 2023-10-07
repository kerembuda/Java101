import java.util.Arrays;
import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word to check: ");
        String word = input.nextLine();
        word = word.strip();
        word = word.toLowerCase();
        int length = word.length();

        char[] ch = new char[length];

        for (int i = length-1; i >= 0; i--) {
            ch[length-i-1] = word.charAt(i);
        }

        char[] ch2 = new char[length];
        for (int i = 0 ; i < length; i++) {
            ch2[i] = word.charAt(i);
        }

        if (Arrays.equals(ch, ch2)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
