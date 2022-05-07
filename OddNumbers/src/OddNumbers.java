import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            // Ask for the number
            System.out.print("Sayi Giriniz: ");
            number = input.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }
        }
        while (number % 2 == 0);
        System.out.print("Dort\'un katlari toplami: " + sum);
    }
}
