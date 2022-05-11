import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        int number, remainder, sum = 0;
        Scanner input = new Scanner(System.in);

        // Ask for the input
        System.out.print("Sayiyi giriniz: ");
        number = input.nextInt();

        while (number > 0) {
            remainder = number % 10;
            sum += remainder;
            number /= 10;
        }

        System.out.print("Rakamlar toplami: " + sum);
    }
}
