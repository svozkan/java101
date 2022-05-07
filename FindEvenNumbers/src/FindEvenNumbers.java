import java.util.Scanner;

public class FindEvenNumbers {

    public static void main(String[] args) {
        int number, sum = 0, numberOfNumbers = 0;

        Scanner input = new Scanner(System.in);

        // Ask for the number
        System.out.print("Sayi Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            if(i % 3 == 0 && i % 4 == 0) {
                sum += i;
                numberOfNumbers++;
            }
        }
        System.out.print("Ortalama: " + (sum / numberOfNumbers));
    }
}
