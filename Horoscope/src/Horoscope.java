import java.util.Scanner;

public class Horoscope {

    public static void main(String[] args) {

        int day, month;

        Scanner input = new Scanner(System.in);

        // Ask for the day
        System.out.print("Dogum gununuzu giriniz: ");
        day = input.nextInt();

        // Ask for the month
        System.out.print("Dogum ayinizi giriniz: ");
        month = input.nextInt();

        if (month == 1) {
            if (day > 21) {
                System.out.print("Kova burcusunuz!");
            }
            else {
                System.out.print("Oglak burcusunuz!");
            }
        }
        else if (month == 2) {
            if (day > 19) {
                System.out.print("Balik burcusunuz!");
            }
            else {
                System.out.print("Kova burcusunuz!");
            }
        }
        else if (month == 3) {
            if (day > 21) {
                System.out.print("Koc burcusunuz!");
            }
            else {
                System.out.print("Balik burcusunuz!");
            }
        }
        else if (month == 4) {
            if (day > 21) {
                System.out.print("Boga burcusunuz!");
            }
            else {
                System.out.print("Koc burcusunuz!");
            }
        }
        else if (month == 5) {
            if (day > 21) {
                System.out.print("Ikizler burcusunuz!");
            }
            else {
                System.out.print("Boga burcusunuz!");
            }
        }
        else if (month == 6) {
            if (day > 22) {
                System.out.print("Yengec burcusunuz!");
            }
            else {
                System.out.print("Ikizler burcusunuz!");
            }
        }
        else if (month == 7) {
            if (day > 22) {
                System.out.print("Aslan burcusunuz!");
            }
            else {
                System.out.print("Yengec burcusunuz!");
            }
        }
        else if (month == 8) {
            if (day > 22) {
                System.out.print("Basak burcusunuz!");
            }
            else {
                System.out.print("Aslan burcusunuz!");
            }
        }
        else if (month == 9) {
            if (day > 22) {
                System.out.print("Terazi burcusunuz!");
            }
            else {
                System.out.print("Basak burcusunuz!");
            }
        }
        else if (month == 10) {
            if (day > 22) {
                System.out.print("Akrep burcusunuz!");
            }
            else {
                System.out.print("Terazi burcusunuz!");
            }
        }
        else if (month == 11) {
            if (day > 21) {
                System.out.print("Yay burcusunuz!");
            }
            else {
                System.out.print("Akrep burcusunuz!");
            }
        }
        else if (month == 12) {
            if (day > 21) {
                System.out.print("Oglak burcusunuz!");
            }
            else {
                System.out.print("Yay burcusunuz!");
            }
        }
    }
}
