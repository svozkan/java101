import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        // Define Data Types
        double amount, KDV_PERCENT_HIGH = 1.18, KDV_PERCENT_LOW = 1.08;

        // Input Scanner Class
        Scanner input = new Scanner(System.in);

        // Read User Inputs
        System.out.print("Ucret tutarini giriniz: ");
        amount = input.nextDouble();

        // Print Amount With Tax
        System.out.println(amount <= 1000 ? amount * KDV_PERCENT_HIGH : amount * KDV_PERCENT_LOW);
    }
}
