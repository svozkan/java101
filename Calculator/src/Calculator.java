import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int number1, number2, selection;

        Scanner input = new Scanner(System.in);

        // Ask For Number 1
        System.out.println("Birinci sayiyi giriniz: ");
        number1 = input.nextInt();

        // Ask For Number 2
        System.out.println("Ikinci sayiyi giriniz: ");
        number2 = input.nextInt();

        // Calculation type
        System.out.println("1-Toplama\n2-Cikartma\n3-Carpma\n4-Bolme ");
        System.out.println("Seciminiz: ");
        selection = input.nextInt();

        switch (selection) {
            case 1: {
                System.out.println("Toplam: " + (number1 + number2));
                break;
            }
            case 2: {
                System.out.println("Cikartma: " + (number1 - number2));
                break;
            }
            case 3: {
                System.out.println("Carpim: " + (number1 * number2));
                break;
            }
            case 4: {
                System.out.println("Bolum: " + (number1 / number2));
                break;
            }
        }
    }
}
