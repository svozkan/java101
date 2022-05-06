import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        // Data Type Decleration
        double corner1, corner2, hypotenuse;

        // Create Input From Scanner Class
        Scanner input = new Scanner(System.in);

        // Ask for first corner
        System.out.println("Birinci kosenin uzunlugunu giriniz: ");
        corner1 = input.nextDouble();

        // Ask for second corner
        System.out.println("Ikinci kosenin uzunlugunu giriniz: ");
        corner2 = input.nextDouble();

        // Calculate Hypotenuse
        hypotenuse = Math.sqrt(Math.pow(corner1, 2) + Math.pow(corner2, 2));

        // Print
        System.out.println("Hipotenus: ");
        System.out.println(hypotenuse);
    }
}
