import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        // Ask for the year
        System.out.print("Dogum yilinizi giriniz: ");
        year = input.nextInt();

        if (year % 12 == 0) {
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        }
        else if (year % 12 == 1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        }
        else if (year % 12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        }
        else if (year % 12 == 3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        }
        else if (year % 12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        }
        else if (year % 12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz : Okuz");
        }
        else if (year % 12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        }
        else if (year % 12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavsan");
        }
        else if (year % 12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        }
        else if (year % 12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz : Yilan");
        }
        else if (year % 12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz : At");
        }
        else if (year % 12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
