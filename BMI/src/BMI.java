import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        double height, weight, BMI;

        // Create Input From Scanner Class
        Scanner input = new Scanner(System.in);

        // Ask For Height
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextDouble();

        // Ask For Weight
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        // Calculate BMI
        BMI = weight / Math.pow(height, 2);

        // Print
        System.out.print("Vücut Kitle İndeksiniz :" + BMI);
    }
}
