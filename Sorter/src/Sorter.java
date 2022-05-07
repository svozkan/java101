import java.util.Scanner;

public class Sorter {

    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner input = new Scanner(System.in);

        // Ask for the numbers
        System.out.print("Birinci sayiyi giriniz:");
        number1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz:");
        number2 = input.nextInt();

        System.out.print("Ucuncu sayiyi giriniz:");
        number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.print("number1 > number2 > number3");
            }
            else {
                System.out.print("number1 > number3 > number2");
            }
        }
        else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.print("number2 > number1 > number3");
            }
            else {
                System.out.print("number2 > number3 > number1");
            }
        }
        else {
            if (number1 > number2) {
                System.out.print("number3 > number1 > number2");
            }
            else {
                System.out.print("number3 > number2 > number1");
            }
        }
    }
}
