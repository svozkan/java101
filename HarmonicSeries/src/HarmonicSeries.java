import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        float sum = 0.0F;

        Scanner input = new Scanner(System.in);

        // Ask for the number
        System.out.print("Sayiyi giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += (1.0/i);
        }

        System.out.print("Toplam: " + sum);
    }
}
