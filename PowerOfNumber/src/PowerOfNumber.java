import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        int number, power, total = 1;
        Scanner input = new Scanner(System.in);

        // Ask for the number and power
        System.out.print("Sayiyi giriniz: ");
        number = input.nextInt();
        System.out.print("Ussunu giriniz: ");
        power = input.nextInt();

        for (int i = 1; i <= power; i++) {
            total *= number;
        }

        System.out.print("Sonuc: " + total);

    }
}
