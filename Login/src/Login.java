import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String username, password;
        int choice;
        String CORRECT_USERNAME = "patika", CORRECT_PASSWORD = "java101";

        Scanner input = new Scanner(System.in);

        // Ask For Username
        System.out.print("Kullanici adinizi giriniz: ");
        username = input.nextLine();

        // Ask For Password
        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {

            System.out.println("Giris Yaptiniz !");
        }
        else if (!password.equals(CORRECT_PASSWORD)) {

            System.out.println("Girilen sifre yanlis.");
            System.out.println("Yeni sifre tanimlamak ister misiniz ?");
            System.out.println("1-Evet\n2-Hayır");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Yeni sifrenizi giriniz: ");
                    /* \n is not consumed by nextInt, add a empty reading for consuming
                    \n otherwise it is consumed by nextLine */
                    input.nextLine();
                    password = input.nextLine();
                    if (password.equals(CORRECT_PASSWORD)){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.print("Şifre oluşturuldu");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Program bitti !");
                    break;
                }
            }

        }

    }
}
