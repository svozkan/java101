import java.util.Scanner;

public class PowersOfNumbers {

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        // Ask for number
        System.out.print("Sinir Sayisini Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.print("\n");
        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + ",");
        }

    }
}
