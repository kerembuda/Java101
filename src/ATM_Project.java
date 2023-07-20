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
        } while(username !=usernameInput ||password !=passwordInput);

        //if log in successful we will continue from here

    }
}


/*
 String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
Ödev
Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
 */