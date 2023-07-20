import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long username, usernameInput;
        long password, passwordInput;
        int entryCount = 4;
        String UserFirstName = "Kerem";
        String UserSurname = "Buda";
        String bankname = "Buda Bank";
        //hard coded ID-Username for now, will improve later. We have 3 tries to enter the system.
        //Otherwise account will be blocked.
        username = 5353603721L;
        password = 19980508L;

        if (entryCount == 4) {
            System.out.println("Hello, welcome to " + bankname);
        } else {
            System.out.println("Wrong username, please try again!!!");
        }
        do {
            System.out.print("Please enter your username (ID number): ");
            usernameInput = input.nextLong();
            System.out.print("Please enter your 6-digit password: ");
            passwordInput = input.nextLong();
            entryCount--;
            if (entryCount == 0) {
                System.out.println("Out of entries, your account is blocked. Please contact the bank.");
                break;
            }
            if (username != usernameInput && password == passwordInput) {
                System.out.println("Wrong username, please try again.\n" + entryCount + "tries left.");
            } else if (password != passwordInput && username == usernameInput) {
                System.out.println("Wrong password, please try again.\n" + entryCount + " tries left.");
            } else if (username != usernameInput || password != passwordInput) {
                System.out.println("Wrong username and password, please try again.\n" + entryCount + " tries left.");
            } else {
                System.out.println("Login successfull!");
            }
        } while (username != usernameInput || password != passwordInput);

        //if log in successful we will continue from here

    }
}