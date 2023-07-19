import java.util.Scanner;

public class LoginID_System {
    public static void main(String[] args) {

        String username, password, kontrol, kontrolpsw, sifirpsw;
        String kontroly = "y";
        String kontroly2;

        Scanner inputU = new Scanner(System.in);
        System.out.print("Bir kullanıcı adı belirleyin: ");
        username = inputU.nextLine();

        Scanner inputPSW = new Scanner(System.in);
        System.out.print("Bir şifre belirleyin: ");
        password = inputPSW.nextLine();


        System.out.print("Patika.dev platformuna hoş geldiniz,Lütfen önce Kullanıcı adınızı giriniz: ");

        Scanner inputU2 = new Scanner(System.in);
        kontrol = inputU2.nextLine();

        if (kontrol.equals(username)) {
            System.out.print("Parolanızı giriniz: ");
            Scanner inputPSW2 = new Scanner(System.in);
            kontrolpsw = inputPSW2.nextLine();
        } else {
            System.out.print("Kullanıcı adı hatalı girdiniz, tekrar deneyiniz: ");
            Scanner inputU3 = new Scanner(System.in);
            kontrol = inputU3.nextLine();

            if (kontrol.equals(username)) {
                System.out.print("Parolanızı giriniz: ");
                Scanner inputPSW2 = new Scanner(System.in);
                kontrolpsw = inputPSW2.nextLine();
            }else {
                System.out.println("Kullanıcı adı hatalı!!!");
                kontrolpsw = "zort";
                System.exit(0);

            }
        }

        boolean AccesGrant = username.equals((kontrol)) && password.equals(kontrolpsw);

        if (AccesGrant) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.print("Parolanız yalnış, parolanızı tekrar girin: ");
            Scanner inputPSW3 = new Scanner(System.in);
            kontrolpsw = inputPSW3.nextLine();

            if (password.equals(kontrolpsw)) {
                System.out.println("Giriş başarılı!");
            } else {
                System.out.println("Parolanızı sıfırlamak ister misiniz?: (y) (n): ");
                Scanner cevap = new Scanner(System.in);
                kontroly2 = cevap.nextLine();
                boolean reset = (kontroly.equals(kontroly2));
                if (reset) {
                    System.out.print("Yeni parolanızı girin: ");
                    Scanner inputPSW4 = new Scanner(System.in);
                    sifirpsw = inputPSW4.nextLine();
                    System.out.print("Yeni parolanız belirlendi, lütfen tekrar parolanızı yazınız: ");
                    Scanner inputPSW5 = new Scanner(System.in);
                    kontrolpsw = inputPSW5.nextLine();
                    System.out.println("Giriş başarılı!");


                    boolean AccesGrant2 = username.equals((kontrol)) && password.equals(sifirpsw);
                    if (AccesGrant2) {
                        System.out.println("Giriş başarılı!");
                    }
                } else {
                    System.out.println("Giriş başarısız!!!");
                }
            }
        }
    }
}