import java.util.Scanner;

public class Advisor {

    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);

        // Get the temperature today
        System.out.println("Hava sicakligini giriniz:");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz");
        }

        else if (temperature < 15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (temperature < 25) {
            System.out.println("Piknik yapabilirsiniz");
        }
        else {
            System.out.println("Yuzmeye gidebilirsiniz");
        }
    }
}
