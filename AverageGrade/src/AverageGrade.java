import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        // Define variables first
        int math, phys, chem, turk, hist, mus;

        // Create a scanner class
        Scanner input = new Scanner(System.in);

        // Ask for math grade
        System.out.print("Matematik ders notunuzu giriniz :");
        math = input.nextInt();

        // Ask for phys grade
        System.out.print("Fizik ders notunuzu giriniz :");
        phys = input.nextInt();

        // Ask for chem grade
        System.out.print("Kimya ders notunuzu giriniz :");
        chem = input.nextInt();

        // Ask for hist grade
        System.out.print("Tarih ders notunuzu giriniz :");
        hist = input.nextInt();

        // Ask for mus grade
        System.out.print("Muzik ders notunuzu giriniz :");
        mus = input.nextInt();

        // Calculate the average
        float average = (math + phys + chem + hist + mus) / 5.0F;

        // Print the average and pass/fail criteria
        System.out.print("Ortalamaniz:" + average + "\n");
        System.out.print(average >= 60 ? "Sinifi Gectiniz" : "Siniftan Kaldiniz");

    }
}
