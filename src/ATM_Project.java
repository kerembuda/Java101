import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long username, usernameInput;
        long password, passwordInput;
        int entryCount = 3;
        int balance = 12000;
        int userSelection = 0;
        int amount;
        boolean isLoginSuccess = false;
        String UserFirstName = "Kerem";
        String UserSurname = "Buda";
        String bankname = "Buddha Bank";
        String currency = "Turkish Lira (₺)";
        //hard coded ID-Username for now, will improve later. We have 3 tries to enter the system.
        //Otherwise, account will be blocked. you will start with 12.000 money.
        username = 123456789L;
        password = 19980508L;

        if (entryCount == 3) {
            System.out.println("Hello, welcome to " + bankname);
        }
        do {
            if (entryCount == 0) {
                System.out.println("Out of entries, your account is blocked. Please contact the bank.");
                break;
            }

            System.out.print("Please enter your username (ID number): ");
            usernameInput = input.nextLong();
            System.out.print("Please enter your 6-digit password: ");
            passwordInput = input.nextLong();

            if (username != usernameInput && password == passwordInput) {
                entryCount--;
                System.out.println("Wrong username, please try again.\n" + entryCount + " tries left.");
            } else if (password != passwordInput && username == usernameInput) {
                entryCount--;
                System.out.println("Wrong password, please try again.\n" + entryCount + " tries left.");
            } else if (username != usernameInput || password != passwordInput) {
                entryCount--;
                System.out.println("Wrong username and password, please try again.\n" + entryCount + " tries left.");
            } else {
                System.out.println("Login successful!");
                isLoginSuccess = true;
            }
        } while (username != usernameInput || password != passwordInput);

        //if log-in is successful we will continue from here
        while (isLoginSuccess) {
            System.out.print("\n1-Withdraw money." +
                    "\n2-Deposit money." +
                    "\n3-Check account balance." +
                    "\n4-Exit the system.\n" +
                    "\nPlease enter your selection: ");
            userSelection = input.nextInt();

            switch (userSelection) {
                case 1:
                    System.out.print("Please enter the amount of money you wish to withdraw: ");
                    amount = input.nextInt();
                    if (amount > balance) {
                        System.out.println("You don't have enough money, please try again.");
                        break;
                    } else {
                        balance -= amount;
                        System.out.println("Successful! " + balance + " " + currency + " left in your balance.");
                        break;
                    }
                case 2:
                    System.out.print("Please enter the amount of money you wish to deposit: ");
                    amount = input.nextInt();
                    balance += amount;
                    System.out.println("Successful! your current balance is " + balance + " " + currency);
                    break;
                case 3:
                    System.out.print("You have " + balance + " " + currency + "\n");
                    break;
                case 4:
                    System.out.print("Thank you for choosing " + bankname + ", see you later!");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Please enter a valid option." + "\n");
            }
        }
    }
}