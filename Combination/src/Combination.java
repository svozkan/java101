import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r, factorialOfN = 1, factorialOfR = 1, factorialOfNR = 1, combination;
        Scanner input = new Scanner(System.in);

        // Ask for the number
        System.out.print("Sayiyi Giriniz: ");
        n = input.nextInt();

        System.out.print("Kacli Kombinasyonu ?: ");
        r = input.nextInt();

        for (int i = n; i > 0; i--) {
            factorialOfN *= i;
        }

        for (int i = r; i > 0; i--) {
            factorialOfR *= i;
        }

        for (int i = (n - r); i > 0; i--) {
            factorialOfNR *= i;
        }

        combination = factorialOfN / (factorialOfR * factorialOfNR);
        System.out.print("Kombinasyon: " + combination);
    }
}
